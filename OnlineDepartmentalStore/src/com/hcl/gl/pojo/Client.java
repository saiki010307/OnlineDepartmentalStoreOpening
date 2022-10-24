package com.hcl.gl.pojo;

public class Client extends User
{
 public Client (int userId,String userName,String password,String userType,String email)
 {
	 super(userId,userName,password,email,"Client");
 }
}
