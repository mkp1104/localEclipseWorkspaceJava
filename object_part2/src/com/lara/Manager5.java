package com.lara;
class F
{
	int i;
	F(int i)
	{
	this.i=i;
	}
	public boolean equals(Object obj)
	{
		F myObj=(F)obj;
	return this.i==myObj.i;
	}
}
public class Manager5
{

	public static void main(String[] args) 
	{
		F f1=new F(10);
		F f2=new F(11);	
		System.out.println(f1.equals(f2)); 
	}
}
