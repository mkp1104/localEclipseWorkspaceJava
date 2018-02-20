package com.lara;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
public class Util 
{
private static SessionFactory sf=null;
static 
{
	Configuration c=new Configuration().configure("config.xml");
	ServiceRegistry sr=new ServiceRegistryBuilder().applySettings(c.getProperties()).build();
	sf=c.buildSessionFactory(sr);
}
public static Session openSession()
{
return sf.openSession(); 	
}
}
