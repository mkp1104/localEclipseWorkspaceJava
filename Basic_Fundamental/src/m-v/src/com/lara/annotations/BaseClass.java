package com.lara.annotations;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface A
{
}
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface B
{
}
@A 
interface BaseInterface
{
		@B
		public void method1();
}
class BaseClass 
{
	@B
	public void method2(){}
}
	 class T extends BaseClass
		implements BaseInterface
	{
		public void method1()
		{}
		
		public void method2()
		{}
	}
	
	