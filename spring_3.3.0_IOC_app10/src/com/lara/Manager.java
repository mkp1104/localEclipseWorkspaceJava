package com.lara;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Manager {
    public static void main(String[] args) {

	ClassPathResource cpr = new ClassPathResource("beans.xml");
	BeanFactory bf = new XmlBeanFactory(cpr);
	Person p = (Person) bf.getBean("p");
	System.out.println(p.getFirstName());
	System.out.println(p.getLastName());
	System.out.println(p.getAge());
	// cpr.registerShutdownHook();

    }
}
