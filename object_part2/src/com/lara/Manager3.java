package com.lara;
class D
{
	int i;
	D(int i)
	{
	this.i=i;
	}
}
public class Manager3
{

	public static void main(String[] args) 
	{
		D d1=new D(90);
		D d2=d1;
		System.out.println(d1==d2);
		System.out.println(d1.equals(d2));
	}
}
