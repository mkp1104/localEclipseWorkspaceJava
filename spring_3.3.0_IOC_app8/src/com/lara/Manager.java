package com.lara;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
public class Manager 
{
public static void main(String[] args)
{
ClassPathResource cpr=new ClassPathResource("config.xml");
System.out.println("done0");
BeanFactory bf=new XmlBeanFactory(cpr);
System.out.println("done1");
Test t1=(Test)bf.getBean("t");
System.out.println("done2");
System.out.println(t1.getPar1());
System.out.println(t1.getPar2());
Test t2=(Test)bf.getBean("t1");//i.e you can pass any no of 
System.out.println(t2.getPar1());
System.out.println(t2.getPar2());

}
}
