package com.lara;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

public class Manager7 {
public static void main(String[] args) {
	
	Session s1=Util.openSession();
//	Criteria ctr_h=s1.createCriteria(Human.class);
	
//	ctr_h.add(Restrictions.like("firstName", "t%"));
//	ctr_h.add(Restrictions.like("age", "t%"));
//	Criteria ctr_h=s1.createCriteria(Human.class).add(Restrictions.like("firstName","t%")).add(Restrictions.gt("age",22));
/*Criterion c1=Restrictions.like("firstName","t%");
Criterion c2=Restrictions.gt("age",22);
Criterion sum=Restrictions.or(c1,c2);
Criteria ctr_h=s1.createCriteria(Human.class);
ctr_h.add(sum);*/
	
/*	Criteria ctr_h=s1.createCriteria(Human.class);
	
	List<Human> list1=ctr_h.list();
	for(Human h1:list1)
	{
		System.out.println(h1.getId()+h1.getFirstName()+h1.getAge());
	}*/

/*	Criteria ctr_p=s1.createCriteria(Person.class);
	
	ctr_p.add(Restrictions.eq("city", "tirupati"));
	ctr_p.add(Restrictions.like("age", 22));*/
	
//	Criteria ctr_p=s1.createCriteria(Person.class).add(Restrictions.eq("city","tirupaty")).add(Restrictions.gt("age",22));
/*Criterion c1=Restrictions.eq("city","tirupati");
Criterion c2=Restrictions.gt("age",22);
Criterion sum=Restrictions.or(c1,c2);
Criteria ctr_p=s1.createCriteria(Person.class);
ctr_p.add(sum);
	List<Person> list1=ctr_p.list();
	for(Person h1:list1)
	{
		System.out.println(h1.getId()+h1.getFirstName()+h1.getAge());
	}*/

	Criteria ctr_e=s1.createCriteria(Employee.class);
	
	ctr_e.add(Restrictions.eq("city", "tirupati"));
	ctr_e.add(Restrictions.like("age", 22));
	
//	Criteria ctr_p=s1.createCriteria(Person.class).add(Restrictions.eq("city","tirupaty")).add(Restrictions.gt("age",22));
/*Criterion c1=Restrictions.eq("city","tirupati");
Criterion c2=Restrictions.gt("age",22);
Criterion sum=Restrictions.or(c1,c2);
Criteria ctr_p=s1.createCriteria(Person.class);
ctr_p.add(sum);
	List<Person> list1=ctr_p.list();
	for(Person h1:list1)
	{
		System.out.println(h1.getId()+h1.getFirstName()+h1.getAge());
	}*/	
	
	
	Criteria ctr_p=s1.createCriteria(Person.class).add(Restrictions.eq("city","tirupati")).add(Restrictions.gt("age",22));
	List<Person> list2=ctr_p.list();
	for (Person p1 : list2) {
		System.out.println(p1.getAddress()+p1.getCity());
	}
/*	Criteria ctr_e=s1.createCriteria(Employee.class);
	List<Employee> list3=ctr_e.list();
	for (Employee e1 : list3) {
		System.out.println(e1.getDesignation()+e1.getEmail());
	}*/
	Criteria ctr_pe=s1.createCriteria(PermanentEmployee.class);
	List<PermanentEmployee> list4=ctr_pe.list();
	for (PermanentEmployee e2 : list4) {
		System.out.println(e2.getFirstName()+e2.getAge());
		System.out.println(e2.getAddress()+e2.getCity());
		System.out.println(e2.getDesignation()+e2.getEmail());
		System.out.println(e2.getLeaveCount()+e2.getSalary());
	}
}
}