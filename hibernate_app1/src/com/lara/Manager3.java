package com.lara;
import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
@SuppressWarnings("deprecation")
public class Manager3 {

	public static void main(String args[])
	{
		Configuration c1=new Configuration();
		c1.configure();
		SessionFactory sf=c1.buildSessionFactory();
		Session s1=sf.openSession();
		Person p2=(Person)s1.load(Person.class, 2);
		p2.setFirstName("hello");
		p2.setLastName("Rahul");
		s1.beginTransaction();
		s1.update(p2);
		s1.getTransaction().commit();
		System.out.println("done");
		
	}
}
