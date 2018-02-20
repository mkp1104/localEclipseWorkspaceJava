package com;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.hibernate.SessionFactory;

public class Util {

	static SessionFactory sf=null;
	static 
	{
		Configuration con=new Configuration().configure("config.xml");
		ServiceRegistry sr=new ServiceRegistryBuilder().applySettings(con.getProperties()).build();
		sf=con.buildSessionFactory(sr);
		
	}
	public static Session openSession()
	{
		return sf.openSession();
		
	}
}
