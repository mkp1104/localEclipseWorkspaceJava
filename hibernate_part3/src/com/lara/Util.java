package com.lara;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.service.ServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.cfg.Configuration;
public class Util 
{
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
