package com.lara;

import org.hibernate.Session;

public class Manager {
	public static void main(String[] args) {
		Session s1 = Util.openSession();
		Human h = new Human();
		h.setId(12);
		h.setFirstName("manish");
		h.setAge(23);
		Person p = new Person();
		p.setAddress("Kolkata");
		p.setCity("Asansol");
		Employee e = new Employee();
		e.setDesignation("S/W Engineer");
		e.setEmail("manish.aec1104@gmail.com");
		PermanentEmployee pe = new PermanentEmployee();
		pe.setSalary(120000.00);
		pe.setLeaveCount(60);
		s1.beginTransaction();
		s1.save(h);
		s1.save(p);
		s1.save(e);
		s1.save(pe);
		s1.getTransaction().commit();
		s1.flush();
		s1.close();
		System.out.println("done");
	}
}
