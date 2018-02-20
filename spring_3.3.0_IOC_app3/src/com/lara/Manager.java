package com.lara;
import java.util.Arrays;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
public class Manager 
{
public static void main(String[] args) 
{
ClassPathResource cpr=new ClassPathResource("config.xml");
BeanFactory bf=new XmlBeanFactory(cpr);
Student s1=(Student)bf.getBean("std1");
System.out.println(s1.getFirstName());
System.out.println(s1.getLastName());
System.out.println(s1.getAge());
System.out.println(s1.getWeight());
System.out.println(s1.getMail());
}
}
