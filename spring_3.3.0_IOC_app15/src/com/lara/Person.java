package com.lara;

public class Person
{
	Person()
	{
		System.out.println("Person-Constr");
		
	}
private String FirstName;
private String LastName;
private int Age;
private Address Permanent_Address;
private Address Present_Address;
public String getFirstName() {
	return FirstName;
}
public void setFirstName(String firstName) {
	FirstName = firstName;
}
public String getLastName() {
	return LastName;
}
public void setLastName(String lastName) {
	LastName = lastName;
}
public int getAge() {
	return Age;
}
public void setAge(int age) {
	Age = age;
}
public Address getPermanent_Address() {
	return Permanent_Address;
}
public void setPermanent_Address(Address permanent_Address) {
	Permanent_Address = permanent_Address;
}
public Address getPresent_Address() {
	return Present_Address;
}
public void setPresent_Address(Address present_Address) {
	Present_Address = present_Address;
}


}
