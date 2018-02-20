package com.lara;
class B 
{
}
public class Manager11
{

	public static void main(String[] args) 
	{
		B b1=new B();
		B b2=new B();
		B b3=new B();
		B b4=new B();
	//	String s2=b1.getClass();//here you con't put  Class as String type ....
		String s1="b1.getClass()";
	//	int s1=b1.getClass();
		Class c1=b1.getClass();
		Class c2=b2.getClass();
		Class c3=b3.getClass();
		Class c4=b4.getClass();
	//	Class c5=new Class();
		Class c6=null;
		System.out.println(b1.getClass());
		System.out.println(c1);
	//	System.out.println(c5);
		System.out.println(c6);
		System.out.println(b1);
		System.out.println(c1==c2);
		System.out.println(c2==c3);
		System.out.println(c3==c4);
		System.out.println(c4==c1);
	}
}