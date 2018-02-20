package com.lara;
import java.lang.reflect.Method;
import java.lang.reflect.Field;
class A1
{
	int attr1;
	String attr2;
	void test1()
	{
	}
	void test2()
	{
	}
	
}
public class Manager1
{

	public static void main(String[] args) throws Exception 
	{

		Class c1=Class.forName("com.lara.A1");
		Field[] fields=c1.getDeclaredFields();
		for(Field f1:fields)
		{
		
		
		System.out.println(f1);
		System.out.println(f1.getName());
		System.out.println(":"+f1.getType());
		}
		System.out.println("-----");
		Method[] methods=c1.getDeclaredMethods();
		for(Method m1:methods)
		{
		System.out.println(m1.getName());
		System.out.println(":"+m1.getReturnType());
		}
	}
}
