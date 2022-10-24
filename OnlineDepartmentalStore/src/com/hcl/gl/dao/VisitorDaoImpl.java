package com.hcl.gl.dao;
import com.hcl.gl.daointerface.*;
import com.hcl.gl.exception.NegativeException;

import java.util.*;

public class VisitorDaoImpl implements VisitorDao
{
	Scanner sc = new Scanner(System.in);

	public void addTask() {}

	public void updateTask() {}

	public void deleteTask() {}

	public void searchTask() {

		int flag = 0; 
		int noOfTasks=0;
		System.out.println("please enter your search name: ");
		String userName = sc.next();
		try
		{
			for(int i=0; i< ClientDaoImpl.size; i++)
			{
				if(userName.equals(ClientDaoImpl.tasks[i].getAssignedTo()))
				{
					flag=1;
					noOfTasks++;
					System.out.println(noOfTasks +" " + ClientDaoImpl.tasks[i].getTaskName());

				}
			}
			if(flag == 0) 
			{
				throw new NegativeException("Tasks does not assigned");
			}
		}
		catch(NegativeException ne)
		{
			System.out.println("no tasks assigned to you");
		}
	}
	public void displayTasks()
	{
		for(int i=0; i < i; i++) 
		{
			System.out.println(ClientDaoImpl.tasks[i].toString());
		}

	}

}


