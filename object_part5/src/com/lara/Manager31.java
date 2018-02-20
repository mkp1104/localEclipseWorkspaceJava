package com.lara;
class D 
{
}
public class Manager31
{
	public static void main(String[] args) throws Exception 
	{
		D obj1=new D();
		Class c1=obj1.getClass();
		Class c2=null;
		try
		{
			c2=Class.forName("com.lara.D");
		}
		catch (ClassNotFoundException ex)
		{
			ex.printStackTrace();
		}
		Class c3=E.class;
		System.out.println(c3);
		System.out.println(c1==c2);
		System.out.println(c2==c3);
		System.out.println(c3==c1);
	}
}

