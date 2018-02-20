package com.lara;
public class M4  
{
	public static void main(String[] args) 
	{
		Boolean b1=false;
		Boolean b2=new Boolean(b1);
		Boolean b3=new Boolean (true);
		Boolean b4=b2.booleanValue();
		Boolean b5=b3.booleanValue();
		System.out.println("done");
	}
}
