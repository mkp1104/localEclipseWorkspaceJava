package com.lara;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Manager
{
public static void main(String[] args) 
{
	
ClassPathXmlApplicationContext cpxac=new ClassPathXmlApplicationContext("config.xml");
Person p=(Person)cpxac.getBean("p");
System.out.println("FirstName:"+p.getFirstName());
System.out.println("LastName:"+p.getLastName());
System.out.println("Age:"+p.getAge());
System.out.println("PermanetAddress:StreetName"+p.getPermanent_Address().getStreetName());
System.out.println("PermanentAddress:CityName"+p.getPermanent_Address().getCityName());
System.out.println("PermanentAddress:Pincode"+p.getPermanent_Address().getPincode());
System.out.println("PeresentAddress:StreetName"+p.getPermanent_Address().getStreetName());
System.out.println("PresentAddress:CityName"+p.getPermanent_Address().getCityName());
System.out.println("PresentAddress:Pincode"+p.getPermanent_Address().getPincode());

}	
}