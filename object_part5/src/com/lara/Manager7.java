package com.lara;
import java.lang.reflect.Method;
import java.util.Scanner;
class H 
{
	public void test1()
	{
		
	System.out.println("from H.test1");
	
	}
}
	class I
	{
	
	public void test2()
	{
	System.out.println("from H.test2");
	}
	}

public class Manager7
{
	public static void main(String[] args) throws Exception 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the class Name:");
		String className=sc.next();
		System.out.println("enter any Method Name Of that Class:");
		String methodName=sc.next();
		Class c1=Class.forName(className);
		Object obj=c1.newInstance();
		Method m1=c1.getDeclaredMethod(methodName);
		m1.invoke(obj);
		System.out.println("done");
		}
}