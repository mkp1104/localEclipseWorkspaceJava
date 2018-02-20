package com.lara;
class D1 
{
}
// there is 3 way!!!!
public class Manager3
{
	public static void main(String[] args) throws Exception 
	{
		D1 obj1=new D1();
		Class c1=obj1.getClass();
		Class c2=null;
		try
		{
			c2=Class.forName("com.lara.D1");
		}
		catch (ClassNotFoundException ex)
		{
			ex.printStackTrace();
		}
		Class c3=D1.class;
		System.out.println(c3);
		System.out.println(c1==c2);
		System.out.println(c2==c3);
		System.out.println(c3==c1);
	}
}

