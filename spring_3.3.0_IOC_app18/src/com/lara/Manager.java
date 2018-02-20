package com.lara;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
public class Manager 
{
public static void main(String[] args) 
{

ClassPathResource cpr=new ClassPathResource("beans.xml");
BeanFactory bf=new XmlBeanFactory(cpr);
Person p=(Person)bf.getBean("p1");
System.out.println(p.getName());
System.out.println(p.getAge());

Person p1=(Person)bf.getBean("p2");
System.out.println(p1.getName());
System.out.println(p1.getAge());
}
}
