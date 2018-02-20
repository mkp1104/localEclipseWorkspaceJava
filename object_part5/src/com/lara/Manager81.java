package com.lara;
public class Manager81 
{
	public static void main(String[] args) throws Throwable 
	{
		Manager81 m1=new Manager81();
		m1=null;
		m1.finalize();
		m1.finalize();
		m1.finalize();
		m1.finalize();
		System.gc();
	}
}
