package com.lara;
import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
@SuppressWarnings("deprecation")
public class Manager1 {

	public static void main(String args[])
	{
		Configuration c1=new Configuration();
		c1.configure();
		SessionFactory sf=c1.buildSessionFactory();
		Session s1=sf.openSession();
		Scanner sc=new Scanner(System.in);
		
		String firstName,lastName,decider;
		int age;
		Person p1=null;
		s1.beginTransaction();
		do
		{
			p1=new Person();
			System.out.println("Enter FirstName :");//here insert into Person (firstName, lastName, age, P_id) values (?, ?, ?, ?) created autometically and this format is possible but not if you use only insert into table_name values(?,?,?,?),Checked by me.....
			p1.setFirstName(sc.next());
			System.out.println("Enter the lastName :");
			p1.setLastName(sc.next());
			System.out.println("Enter the age :");
			p1.setAge(sc.nextInt());
			//
			s1.save(p1);
			System.out.println("Do you want to save one more y/n :");
			decider=sc.next();
		}while("y".equals(decider));
		s1.getTransaction().commit();
		s1.flush();
		s1.close();
		System.out.println("done");
		
	}
}
