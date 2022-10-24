package com.hcl.gl.exception;

public class NegativeException extends RuntimeException
{
	public NegativeException(String msg)
	{
		System.out.println("InvalidInput:"+msg);
	}
}
