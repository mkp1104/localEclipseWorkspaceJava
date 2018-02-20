package com.lara;
import java.lang.reflect.Modifier;
import java.lang.reflect.Field;
class A2
{
}
class B2
{
int field1;
protected Double field2;
public A2 field3;
public static final int MAX_VALUE=20;
}
public class Manager2
{

	public static void main(String[] args) throws Exception 
	{

		Class c1=Class.forName("com.lara.B2");
		Field[] fields=c1.getDeclaredFields();
		for(Field f1:fields)
		{
		
		
		System.out.println(f1.getName());
		System.out.println(":"+f1.getType());
		
			System.out.println(":"+f1.getModifiers());
}
}
}