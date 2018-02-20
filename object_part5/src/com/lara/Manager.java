package com.lara;
class A 
{
}
public class Manager
{

	public static void main(String[] args) 
	{
		A a1=new A();
		A a2=new A();
		//A a3=new Manager();
		System.out.println(a1==a2);
	//	System.out.println(a1==a3);
		Class c1=a1.getClass();
		Class c2=a2.getClass();
		System.out.println(c1==c2);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(a1.getClass());
	}
}
