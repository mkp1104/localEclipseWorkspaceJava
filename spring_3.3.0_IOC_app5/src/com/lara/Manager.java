package com.lara;
import java.util.Arrays;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
public class Manager 
{
public static void main(String[] args) 
{
	System.out.println("done0");
ClassPathResource cpr=new ClassPathResource("config.xml");//No Object of Student and Bean-Factory is Created,Even setter is initialized..
System.out.println("done1");
BeanFactory bf=new XmlBeanFactory(cpr);// Object of Student and Bean-Factory is Created
System.out.println("done2");
Student s1=(Student)bf.getBean("std1");
Student s2=(Student)bf.getBean("std1");
Student s3=(Student)bf.getBean("std1");
System.out.println("s1: "+s1);
System.out.println("s2: "+s2);
System.out.println("s3: "+s3);
}
}
