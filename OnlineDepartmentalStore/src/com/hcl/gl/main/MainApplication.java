package com.hcl.gl.main;
import java.util.Scanner;

import com.hcl.gl.dao.*;
import com.hcl.gl.daointerface.*;

public class MainApplication 
{ 
	public void main1()
	{
		int choice,noOfUsers;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of Users");
		noOfUsers=sc.nextInt();

		UserDaoImpl userDao=new UserDaoImpl(noOfUsers);

		do
		{
			System.out.println("Select your option");
			System.out.println("1.Register");
			System.out.println("2.login");
			System.out.println("0.logout");
			choice=sc.nextInt();

			switch(choice)
			{
			case 1: userDao.register();
			System.out.println("___________Successfully Registered__________");
			break;
			case 2: userDao.login();
			System.out.println("___________Login successfull__________");
			break;
			case 0: System.out.println("________Successfully logout!!_________");
			System.out.println("_____Thank You !!_____");
			break;
			default: System.out.println("Invalid input!!");
			}
		}
		while(choice!=0);
	}
}


