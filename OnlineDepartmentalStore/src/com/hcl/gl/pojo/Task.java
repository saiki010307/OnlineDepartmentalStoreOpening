package com.hcl.gl.pojo;

public class Task 
{
		private int taskId;
		private String taskName;
		private String taskText;
		private String assignedTo;
		private String taskDescription;

		public String getTaskName() 
		{
			return taskName;
		}
		public void setTaskName(String taskName) 
		{
			this.taskName = taskName;
		}
		public String getTaskDescription() 
		{
			return taskDescription;
		}
		public void setTaskDescription(String taskDescription) 
		{
			this.taskDescription = taskDescription;
		}
		public int getTaskId() 
		{
			return taskId;
		}
		public void setTaskId(int taskId) 
		{
			this.taskId = taskId;
		}
		public String getTaskText() {
			return taskText;
		}
		public void setTaskText(String taskText) 
		{
			this.taskText = taskText;
		}
		public String getAssignedTo() 
		{
			return assignedTo;
		}
		public void setAssignedTo(String assignedTo) 
		{
			this.assignedTo = assignedTo;
		}
		public void setCompletionDate(String next) {
			// TODO Auto-generated method stub
			
		}
		public String getCompletionDate() {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public String toString() {
			return "Task [taskId=" + taskId + ", taskName=" + taskName + ", taskText=" + taskText + ", assignedTo="
					+ assignedTo + ", taskDescription=" + taskDescription + "]";
		}

		
		

	}

