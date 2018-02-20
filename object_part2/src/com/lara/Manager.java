package com.lara;
class A
{
	int i;
}
public class Manager
{

	public static void main(String[] args) 
	{
		A a1=new A();
		a1.i=10;
		A a2=new A();
		a2.i=10;
		A a3=a1;
		System.out.println(a1==a2);
		System.out.println(a2==a3);
		System.out.println(a1==a3);
	}
}
