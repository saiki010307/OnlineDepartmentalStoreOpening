package com.hcl.gl.dao;

import com.hcl.gl.daointerface.*;
import com.hcl.gl.exception.NegativeException;
import com.hcl.gl.pojo.Task;
import com.hcl.gl.pojo.User;

import java.util.*;

public class ClientDaoImpl implements ClientDao
{
	Scanner sc = new Scanner(System.in);
	static Task tasks[];
	int taskCount;
	static int size=0;
	int taskId;
	int flag=0;
	private int noOfTasks;
	public void arrangeByDate()
	{
		for(int i=0;i<taskCount;i++)
		{
			for(int j=0;j<taskCount;j++)
			{
				if(tasks[i].getCompletionDate().compareTo(tasks[j].getCompletionDate())>0)
				{
					Task t=tasks[i];
					tasks[i]=tasks[j];
					tasks[j]=t;
				}
			}
		}
	}
	public ClientDaoImpl()
	{

	}
	ClientDaoImpl(int taskCount)
	{
		taskId=1;
		size=0;
		this.taskCount = taskCount;
		tasks = new Task[taskCount];
	}

	public void addTask() 
	{
		Task task = new Task();
		System.out.println("Enter taskId");
		task.setTaskId(sc.nextInt());
		System.out.println("Enter taskName");
		task.setTaskName(sc.next());
		System.out.println("Enter taskText");
		task.setTaskText(sc.next());
		System.out.println("Enter AssignedTo:");
		task.setAssignedTo(sc.next());
		System.out.println("Enter task Description");
		task.setTaskDescription(sc.next());
		System.out.println("enter the completionDate");
		task.setCompletionDate(sc.next());
		tasks[size]=task;
		size++;
		System.out.println("___________Task added successfully__________");

	}

	public void updateTask() 
	{
		int flag=0;

		System.out.println("Enter the task name to be updated: ");
		String taskName = sc.next();
		System.out.println("updated task is:");
		String updatedTask = sc.next();

		try {

			for(int i=0; i< size; i++) 
			{
				if(taskName.equals(tasks[i].getTaskName())) 
				{
					tasks[i].setTaskName(updatedTask);
					System.out.println("__________Task updated successfully__________");
					flag = 1;
				}
			}
			if(flag == 0) 
			{
				throw new NegativeException("Task does not exist");
			}
		}
		catch(NegativeException ne)
		{
			System.out.println("");
		}
	}

	public void deleteTask() 
	{
		int flag = 0;
		System.out.println("Enter the task name to be deleted");
		String deleteTask = sc.next();
		try 
		{
			for(int i=0; i< size; i++) 
			{
				if(deleteTask.equals(tasks[i].getTaskName())) 
				{
					tasks[i].setTaskName(null);
					tasks[i].setTaskText(null);
					tasks[i].setAssignedTo(null);
					System.out.println("___________Task deleted successfully!!_________");

					flag = 1;
				}
			}
			if(flag == 0) 
			{
				throw new NegativeException("Task does not exist");
			}
		}
		catch(NegativeException ne)
		{
			System.out.println("Entered task does not exist\n");
		}
	}

	public void searchTask() 
	{
		int flag = 0;
		System.out.println("Enter the task name to be searched");
		String searchTask = sc.next();
		try
		{
			for(int i=0; i< size; i++)
			{
				if(searchTask.equals(tasks[i].getTaskName())) 
				{
					System.out.println("Task name searched : task name"+ tasks[i].getTaskName() + " "+ tasks[i].getTaskId());
					System.out.println("_________Task searched successfully_________");
					flag = 1;
				}
			}
			if(flag == 0) 
			{
				throw new NegativeException("Task does not searched");
			}
		}
		catch(NegativeException ne)
		{
			System.out.println("");
		}
	}

	public void assignedTask() 
	{
		int flag = 0;
		System.out.println("Enter the task name");
		String taskName = sc.next();
		System.out.println("assigned task to:");
		String taskAssignedTo = sc.next();
		try
		{
			for(int i=0; i < size; i++)
			{
				if(taskName.equals(tasks[i].getTaskName())) 
				{
					tasks[i].setAssignedTo(taskAssignedTo);
					System.out.println("_______Task assigned successfully_______\n");
					flag = 1;
				}
			}
			if(flag == 0)
			{
				throw new NegativeException("Task cannot be assigned");
			}
		}
		catch(NegativeException ne)
		{
			System.out.println(" Task cannot be assigned");
		}
	}

	public void displayTasks() 
	{
		for(int i=0; i < size; i++) 
		{
			System.out.println(tasks[i].toString());
		}
	}
	public void run()
	{
		System.out.println("__________Welcome_________");
	}

}
