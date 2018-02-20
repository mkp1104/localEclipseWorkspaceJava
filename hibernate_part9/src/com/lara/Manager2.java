package com.lara;
import org.hibernate.Session;
public class Manager2
{
	public static void main(String[] args) 
	{
		
	Session s1=Util.openSession();
	Human1 h1=(Human1)s1.load(Human1.class, 1);
	System.out.println(h1.getId()+h1.getFirstName()+h1.getAge());
	Person1 p1=(Person1)s1.load(Person1.class, 2);
	System.out.println(p1.getAddress()+p1.getCity());
	Employee1 e1=(Employee1)s1.load(Employee1.class, 3);
	System.out.println(e1.getDesignation()+e1.getEmail());
	PermanentEmployee1 pe1=(PermanentEmployee1)s1.load(PermanentEmployee1.class, 4);
	System.out.println(pe1.getSalary()+pe1.getLeaveCount());
	s1.close();
	
	}

}
