package com.lara;
import org.hibernate.Session;
public class Manager {

	public static void main(String args[])
	{
		Action pn=new Action();
		pn.setId(101);
		pn.setFirstName("abc");
		pn.setLastName("xyz");
		pn.setAge(23);
		Session s1=Util.openSession();
		s1.beginTransaction();
		s1.save(pn);
		s1.getTransaction().commit();
		s1.flush();
		s1.close();
		System.out.println("done");
		
	}
}
