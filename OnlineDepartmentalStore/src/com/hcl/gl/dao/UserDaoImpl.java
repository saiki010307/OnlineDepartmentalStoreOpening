package com.hcl.gl.dao;
import java.util.Scanner;
import com.hcl.gl.pojo.*;
import com.hcl.gl.daointerface.*;
import com.hcl.gl.exception.NegativeException;
import com.hcl.gl.pojo.User;
public class UserDaoImpl implements UserDao
{
	User users[];
	Scanner sc=new Scanner(System.in);
	int size;
	int noOfUsers;
	public UserDaoImpl(int noOfUsers)
	{
		size=0;
		this.noOfUsers=noOfUsers;
		users=new User[noOfUsers];
	}
	public void register()
	{
		User user=new User();
		System.out.println("Enter the UserId: ");
		user.setUserId(sc.nextInt());
		System.out.println("Enter the Username: ");
		user.setUserName(sc.next());
		System.out.println("Enter the Password: ");
		user.setPassword(sc.next());
		System.out.println("Enter the your Email Id: ");
		user.setEmail(sc.next());
		System.out.println("Enter the UserType: ");
		user.setUserType(sc.next());
		users[size]=user;
		size++;

	}
	public void login()
	{
		System.out.println("your are Client or Visitor: ");
		String UserType=sc.next();
		System.out.println("Enter your UserId: ");
		int UserId=sc.nextInt();
		System.out.println("Enter your Password: ");
		String Password=sc.next();

		for(int i=0;i<size;i++)
		{
			if(UserId==users[i].getUserId() && Password.equals(users[i].getPassword()) && UserType.equals(users[i].getUserType()))
			{
				if(UserType.equalsIgnoreCase("Client"))
				{
					int choice;
					int taskCount = users.length;

					ClientDaoImpl clientDaoImpl = new ClientDaoImpl(taskCount);
					System.out.println("____________Welcome Client_____________");
					do 
					{
						System.out.println("___________Task management system__________");
						System.out.println("1. Add the tasks");
						System.out.println("2. Update the tasks");
						System.out.println("3. Delete the tasks");
						System.out.println("4. search the tasks");
						System.out.println("5. Assigned Task");
						System.out.println("6. Display All tasks");
						System.out.println("7. Register another user");
						System.out.println("8. Login another account");
						System.out.println("0. exit\n ");
						choice = sc.nextInt();

						switch(choice) 
						{

						case 1:clientDaoImpl.addTask();
						break;
						case 2:clientDaoImpl.updateTask();
						break;
						case 3:clientDaoImpl.deleteTask();
						break;
						case 4:clientDaoImpl.searchTask();
						break;
						case 5:clientDaoImpl.assignedTask();
						break;
						case 6:clientDaoImpl.displayTasks();
						break;
						case 7:register();
						break;
						case 8:login();
						break;
						case 0:System.out.println("Exit Succssfully!!");
						break;
						default:System.out.println("Invalid choice");
						}

					}while(choice != 0);

				}
				else if(UserType.equalsIgnoreCase("Visitor"))
				{	
					int choice;
					System.out.println("_____________Welcome visitor_______________\n");
					do {
						VisitorDaoImpl visitorDaoImpl = new VisitorDaoImpl();
						System.out.println("_______MENU_______");
						System.out.println("select your option :");
						System.out.println("1. Display the assinged tasks: ");
						System.out.println("2. View all tasks");
						System.out.println("0. exit ");

						choice = sc.nextInt();

						switch(choice) 
						{
						case 1:
							visitorDaoImpl.searchTask();
							break;
						case 2:
							visitorDaoImpl.displayTasks();
						case 0:
							System.out.println("logout successfully!!");
							break;
						default:
							System.out.println("Please try again!!");
						}

					}while(choice != 0);

				}
				else 
				{
					try
					{
						throw new NegativeException("User type does not exist");
					}
					catch(NegativeException ne)
					{
						System.out.println("_________Please try again________");
					}
				}
			}
		}

	}
}
