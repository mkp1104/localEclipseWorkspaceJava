package com.lara;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Criteria;

public class Manager5 {
public static void main(String[] args) {
	
	Session s1=Util.openSession();
	Criteria ctr_h=s1.createCriteria(Human.class);
	List<Human> list1=ctr_h.list();
	for(Human h1:list1)
	{
		System.out.println(h1.getId()+h1.getFirstName()+h1.getAge());
	}
	Criteria ctr_p=s1.createCriteria(Person.class);
	List<Person> list2=ctr_p.list();
	for (Person p1 : list2) {
		System.out.println(p1.getAddress()+p1.getCity());
	}
	Criteria ctr_e=s1.createCriteria(Employee.class);
	List<Employee> list3=ctr_e.list();
	for (Employee e1 : list3) {
		System.out.println(e1.getDesignation()+e1.getEmail());
	}
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
