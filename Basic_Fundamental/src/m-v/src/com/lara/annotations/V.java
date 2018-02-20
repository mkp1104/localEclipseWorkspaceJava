package com.lara.annotations;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.Annotation;
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@interface Bar
{
		String value();
}
@Retention(RetentionPolicy.RUNTIME)
@interface Foo
{
String value();
}
@Bar(value="a-bar")
@Foo(value="a-foo")
class U
{
}
class V extends U

{
	public static void main(String[] args) throws ClassNotFoundException
	{

		Annotation[] anns=U.class.getAnnotations();
		System.out.println(anns.length);
			for(Annotation a:anns)
		{
		if(a instanceof Bar)
			{
				Bar b1=(Bar) a;
				System.out.println("bar:"+b1.value());
			}
			if(a instanceof Foo)
			{
			Foo f1=(Foo)a;
	System.out.println("Foo:" + f1.value());
	
			}
			System.out.println("---");
			}

			System.out.println("======");
			anns=V.class.getAnnotations();
			System.out.println(anns.length);
			for(Annotation a:anns)
		{
			if(a instanceof Bar)
			{
			Bar b1=(Bar)a;
			System.out.println("Bar:"+b1.value());
			
			}
			if(a instanceof Foo)
			{
				Foo f1=(Foo)a;
			System.out.println("Foo:"+ f1.value());
			}
System.out.println("---");			
			}
		}
	}