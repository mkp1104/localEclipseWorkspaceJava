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
Employee e1=(Employee)bf.getBean("e");
System.out.println("Name:"+e1.getName());
System.out.println("Age:"+e1.getAge());
System.out.println("Weight:"+e1.getWeight());
System.out.println("Address:(House_no):"+e1.getPermanentAddress().getHouse_no());
System.out.println("Address(Street_Name):"+e1.getPermanentAddress().getStreet_name());
System.out.println("Mobile N0:"+e1.getMobile_no());
System.out.println("Educations:"+e1.getEducations());
System.out.println("Mails:"+e1.getMails());

}
}
