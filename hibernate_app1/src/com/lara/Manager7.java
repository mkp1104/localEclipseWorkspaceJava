package com.lara;
import java.util.Arrays;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
public class Manager7 {

	public static void main(String args[])
	{
		Session s1=Util.openSession();
		Query query=s1.createQuery("from com.lara.Person");
		List<Person> list3=query.list();
		for (Person p1 : list3) 
		{
			System.out.println(p1.getId()+"-"+p1.getFirstName()+"-"+p1.getLastName()+"-"+p1.getAge());
		}
		System.out.println("done");
		
	}
}
