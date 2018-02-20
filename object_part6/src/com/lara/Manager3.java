package com.lara;
import java.lang.reflect.Modifier;
import java.lang.reflect.Method;
import java.util.Arrays;
class C
{
void test1()
	{}
public final double test2(int i)
	{
		return 20;
	}
public synchronized static void test3(double d)
	{}
}
public class Manager3
{

	public static void main(String[] args) throws Exception 
	{

		Class c1=Class.forName("com.lara.C");
		Method Methods[]=c1.getDeclaredMethods();
		for(Method m1:Methods)
		{
		
		
		System.out.println(m1.getName());
		System.out.println(":"+m1.getReturnType());
		
			System.out.println(":"+Arrays.toString(m1.getParameterTypes()));
			System.out.println(":"+Modifier.toString(m1.getModifiers()));
	//		System.out.println(":"+m1.getModifiers()); return type is integer.
}
	//	System.out.println(":"+Arrays.toString(Methods));
//		System.out.println(":"+Modifier.toString(Methods));
}
}