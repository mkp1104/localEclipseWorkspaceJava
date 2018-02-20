package com.lara;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
public class Manager 
{
public static void main(String[] args)
{
ClassPathResource cpr=new ClassPathResource("config.xml");
BeanFactory bf=new XmlBeanFactory(cpr);
Person p1=(Person)bf.getBean("p1");
System.out.println(p1.getFirstName());
System.out.println(p1.getLastName());
System.out.println(p1.getAge());
System.out.println(p1.getLoverNames());
System.out.println(p1.getEducations());
System.out.println(p1.getMobileNo());
System.out.println(p1.getPermanentAdress().getHouse_No());
System.out.println(p1.getPermanentAdress().getStreet_Name());

	
}
}
