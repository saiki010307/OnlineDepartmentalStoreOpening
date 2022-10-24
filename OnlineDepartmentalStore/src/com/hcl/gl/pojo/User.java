package com.hcl.gl.pojo;

public class User 
{
		 int userId;
		 String userName;
		 String password;
		 String userType;
	     String email;
	     
	     public User()
	     {
	    	 
	     }

		public int getUserId() 
		{
			return userId;
		}

		public void setUserId(int userId) 
		{
			this.userId = userId;
		}

		public String getEmail() 
		{
			return email;
		}

		public void setEmail(String email) 
		{
			this.email = email;
		}

		public String getUserName() 
		{
			return userName;
		}

		public void setUserName(String userName) 
		{
			this.userName = userName;
		}

		public String getPassword() 
		{
			return password;
		}

		public void setPassword(String password) 
		{
			this.password = password;
		}

		public String getUserType() 
		{
			return userType;
		}

		public void setUserType(String userType) 
		{
			this.userType = userType;
		}

		public User(int userId, String userName, String password, String userType, String email) {
			super();
			this.userId = userId;
			this.userName = userName;
			this.password = password;
			this.userType = userType;
			this.email = email;
		}


	}

