package com.lara;
class T
{
	int i=110;
	void Tost()
	{
	System.out.println("Tost()");
	}
}
public class Test

{
	public static void main(String[] args) 
	{
		new T().Tost();
		
		System.out.println(new T().i);
	}
}
