package com.lara.annotations;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
@Retention(RetentionPolicy.RUNTIME)
@interface Author
{
	String name() default "unknown";
}
@Retention(RetentionPolicy.RUNTIME)
@interface Version
{
double number();
}
@Author(name="Johny")
@Version(number=1.0)
public class S
{
	@Author(name="Author1")
	@Version(number=2.0f)
	public void annotatedMethod1()
	{
		System.out.println("annotationMethod1()");
	}
	
@Author(name="Author2")
@Version(number=4.0)
	public void annotatedMethod2()
	{
		System.out.println("annotationMethod2()");
	}
}