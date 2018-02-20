package com.lara;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Manager 
{
public static void main(String[] args)
{
	ClassPathXmlApplicationContext cpxac=new ClassPathXmlApplicationContext("config.xml");
	Test t=(Test)cpxac.getBean("t");
	System.out.println(t.getParm1());
}
}
