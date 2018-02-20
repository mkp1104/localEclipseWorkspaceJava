package com.lara;
//import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Manager1 
{
	public static void main(String[] args) {
		ClassPathXmlApplicationContext c=new ClassPathXmlApplicationContext("beans.xml");
		Person p=(Person)c.getBean("p");
		System.out.println(p.getFirstName());
		System.out.println(p.getLastName());
		System.out.println(p.getAge());
		c.registerShutdownHook();
	}
}
