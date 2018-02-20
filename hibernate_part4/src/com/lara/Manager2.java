package com.lara;
import org.hibernate.Session;
public class Manager2
{
	public static void main(String[] args) 
	{
	Session s1=Util.openSession();
	Human h1=(Human)s1.load(Human.class, 1);
	System.out.println(h1.getId()+h1.getFirstName()+h1.getAge());
	Person p1=(Person)s1.load(Person.class, 2);
	System.out.println(p1.getAddress()+p1.getCity());
	Employee e1=(Employee)s1.load(Employee.class, 3);
	System.out.println(e1.getDesignation()+e1.getEmail());
	PermanentEmployee pe1=(PermanentEmployee)s1.load(PermanentEmployee.class, 4);
	System.out.println(pe1.getSalary()+pe1.getLeaveCount());
			s1.close();
			
	}

}
