package com.lara.annotations;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(value=RetentionPolicy.RUNTIME)
abstract @interface Person
{
public abstract String PersonFirstName();
public abstract String PersonLastName();
public abstract String PersonEmailId();
public abstract String PersonAdress() default "Bangalore";
public abstract int PersonAge() default 23;
}
@Person(PersonFirstName="abc",
		PersonLastName="abc",
		PersonEmailId="abc@laratechnology.com",
		PersonAdress="abc",
		PersonAge=25)
class RPersonTestAnnotation
{
	public static void main(String args[])
	{
	}
}