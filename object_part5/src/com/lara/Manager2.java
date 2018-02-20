package com.lara;
class C 
{
}
public class Manager2
{
	public static void main(String[] args) throws Exception 
	{
		Class c1=Class.forName("com.lara.C");
		C obj1=new C();
		Class c2=obj1.getClass();
		System.out.println(c1==c2);
	//	System.out.println(c1==obj1);
		System.out.println(c1);
	}
}

