package com.lara;

import org.hibernate.Session;

public class Manager {
	public static void main(String[] args) {
		//System.out.println("done");
		Session s1 = Util.openSession();
		System.out.println("done");
		Human1 h = new Human1();
		h.setId(12);
		h.setFirstName("manish");
		h.setAge(23);
		Person1 p = new Person1();
		p.setAddress("Kolkata");
		p.setCity("Asansol");
		Employee1 e = new Employee1();
		e.setDesignation("S/W Engineer");
		e.setEmail("manish.aec1104@gmail.com");
		PermanentEmployee1 pe = new PermanentEmployee1();
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
