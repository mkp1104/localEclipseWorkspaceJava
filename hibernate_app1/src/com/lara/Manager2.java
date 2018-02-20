package com.lara;
import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
@SuppressWarnings("deprecation")
public class Manager2 {

	public static void main(String args[])
	{
		Configuration c1=new Configuration();
		c1.configure();
		ServiceRegistry sr=new ServiceRegistryBuilder().applySettings(c1.getProperties()).build();
		SessionFactory sf=c1.buildSessionFactory(sr);
		Session s1=sf.openSession();
		System.out.println("done");
		Person p1=(Person)s1.load(Person.class,1);
		System.out.println(p1.getId()+"-"+p1.getFirstName()+"-"+p1.getLastName()+"-"+p1.getAge());
		System.out.println(p1.getAge());		
		System.out.println("done");
		
	}
}
