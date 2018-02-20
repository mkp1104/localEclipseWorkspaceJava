package com.lara;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.service.ServiceRegistryBuilder;

public class Util {

	private static SessionFactory sf=null;
	static
	{
		Configuration cfg=new Configuration().configure();
		ServiceRegistry sr=new ServiceRegistryBuilder().applySettings(cfg.getProperties()).build();
		sf=cfg.buildSessionFactory(sr);
		
	}
	static public Session openSession()
	{
		return sf.openSession();
		
	}
}
