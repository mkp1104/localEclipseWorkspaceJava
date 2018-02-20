package com.lara;
import java.util.Arrays;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Manager 
{
public static void main(String[] args) {
	ClassPathResource cpr=new ClassPathResource("beans.xml");
	BeanFactory factory=new XmlBeanFactory(cpr);
	Person p1=(Person) factory.getBean("p1");
	System.out.println(p1.getFirstName());
	System.out.println(p1.getLastName());
	System.out.println(p1.getAge());
	System.out.println(Arrays.toString(p1.getMarks()));

}
}
