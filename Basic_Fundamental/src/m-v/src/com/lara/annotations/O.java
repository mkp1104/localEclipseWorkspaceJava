package com.lara.annotations;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
@Target(ElementType.METHOD)
@interface Ann4
{ 
public String someMessage();
}

@Ann4(someMessage="hello")

class O
{
@Ann4(someMessage="hello")
		public static void main(String[] args) 
		{
			System.out.println("Hello World!");
		}
}