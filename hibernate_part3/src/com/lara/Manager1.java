package com.lara;
import org.hibernate.Session;
public class Manager1 
{
public static void main(String[] args) 
{
	Person p1=new Person();
//	p1.setId(101);
	p1.setFirstname("Mansih");
	p1.setLastname("Prasad");
	p1.setAge(24);
	Address a1=new Address();
	a1.setCity("Purulia");
	a1.setCountry("India");
	a1.setPincode(723121);
	a1.setState("West Bengal");
	a1.setStreetname("saheb-para");
	p1.setAdd(a1);
	Session s1=Util.openSession(); 
	s1.beginTransaction();
	s1.save(p1);
	s1.getTransaction().commit();
	s1.flush();
	s1.close();
	System.out.println("done");
}
}
