package com.lara;
import java.lang.reflect.Method;
class A
{
	public void test()
	{
		System.out.println("test");
	}
	public void test1()
	{
		System.out.println("test1");
		
	}
}
public class Test1 
{
public static void main(String[] args) throws Exception 
{
Class c1=Class.forName("com.lara.A");
A a1=(A)c1.newInstance();
a1.test();
a1.test1();
Object obj=c1.newInstance();
Method m1=c1.getDeclaredMethod("test");
m1.invoke(obj);
}
}
