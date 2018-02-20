package com.lara;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class Util 
{
	static SessionFactory sf=null;
	static
	{
		
		Configuration con=new Configuration().configure();
		ServiceRegistry sr=new ServiceRegistryBuilder().applySettings(con.getProperties()).build();
		sf=con.buildSessionFactory(sr);
		
		
	}
	public static Session openSession()
	{
		return sf.openSession();
		
	}
	
}
