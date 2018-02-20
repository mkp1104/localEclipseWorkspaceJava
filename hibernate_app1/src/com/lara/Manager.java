package com.lara;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
@SuppressWarnings("deprecation")
public class Manager {

	public static void main(String args[])
	{
		Person pn=new Person();
		pn.setId(101);
		pn.setId(102);
		pn.setFirstName("abc");
		pn.setLastName("xyz");
		pn.setAge(23);
		Configuration c1=new Configuration();
		c1.configure();
		ServiceRegistry sr=new ServiceRegistryBuilder().applySettings(c1.getProperties()).build();
		SessionFactory sf=c1.buildSessionFactory(sr);
		Session s1=sf.openSession();
		s1.beginTransaction();
		s1.save(pn);
		s1.getTransaction().commit();
		s1.flush();
		s1.close();
		System.out.println("done");
		
	}
}
