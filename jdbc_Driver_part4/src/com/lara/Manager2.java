package com.lara;
import org.hibernate.Session;
public class Manager2 
{
public static void main(String[] args) 
{
	Session s1=Util.openSession();
	Person p1=(Person)s1.load(Person.class,1);
	System.out.println(p1.getFirstName()+p1.getLastName()+p1.getAge());
	System.out.println(p1.getAddress().getHouse_no());
	
	
}
}
