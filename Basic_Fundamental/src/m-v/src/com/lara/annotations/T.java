package com.lara;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface A
{
}
@Retention(RetentionPolicy.RUNTIME)
@interface Version
{
}
@A interface BaseClass
{
	@B
		public void method2(

	{}
	public class T extendsBaseClass
		implements BaseClass
	{
		public void method1()
		{}
		
		public void method2()
		{}
	}
	
	}