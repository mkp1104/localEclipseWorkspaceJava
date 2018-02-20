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
		
		Configuration con=new Configuration();
		con.setProperty("hibernate.dialect","org.hibernate.dialect.OracleDialect");
		con.setProperty("hibernate.connection.driver_class","oracle.jdbc.driver.OracleDriver");
		con.setProperty("hibernate.connection.username","system");
		con.setProperty("hibernate.connection.password","system123");
		con.setProperty("hibernate.connection.url","jdbc:oracle:thin:@localhost:1521:XE");
		con.setProperty("hibernate.hbm2ddl.auto","update");
		con.setProperty("hibernate.show_sql","true");
		con.addResource("com/lara/Action.hbm.xml");
		ServiceRegistry sr=new ServiceRegistryBuilder().applySettings(con.getProperties()).build();
		sf=con.buildSessionFactory(sr);
		
		
	}
	public static Session openSession()
	{
		return sf.openSession();
		
	}
	
}
