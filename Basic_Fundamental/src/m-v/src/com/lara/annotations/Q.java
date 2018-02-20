package com.lara.annotations;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)

@interface Ann6
{ 
	
	public String doStuff();
public int size() default 0;
}
@Ann6(doStuff="abc",size=100)

class Q
{
@Ann6(doStuff="abc",size=100)

		public static void main(String[] args) 
		{
			System.out.println("Hello World!");
		}
}