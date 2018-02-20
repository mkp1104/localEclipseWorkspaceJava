package com.lara;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Manager
{
public static void main(String[] args) 
{
ClassPathXmlApplicationContext cpxap=new ClassPathXmlApplicationContext("config.xml");
Person p=(Person)cpxap.getBean("p");
System.out.println(p.getFirstName());
System.out.println(p.getLastName());
System.out.println(p.getAge());
cpxap.registerShutdownHook();
}
}
