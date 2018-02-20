package com.lara;

public class Person
{
private String Name;
private int Age;
Person(String Name,int Age)
{
	System.out.println("Person()");
this.Name=Name;
this.Age=Age;
}
public String getName() {
	return Name;
}
public int getAge() {
	return Age;
}

}
