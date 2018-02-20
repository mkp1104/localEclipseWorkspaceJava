package com.lara;
import java.util.Arrays;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
public class Manager4 {

	public static void main(String args[])
	{
		Session s1=Util.openSession();
		Criteria ctr=s1.createCriteria(Person.class);
		List<Person> list=ctr.list();
		ctr.add(Restrictions.eq("firstName", "lara"));
		ctr.add(Restrictions.gt("age", 15));
		ctr.add(Restrictions.like("lastName", "%s%"));
		for(Person p1:list)
		{
			System.out.println(p1.getId()+"-"+p1.getFirstName()+"-"+p1.getLastName()+"-"+p1.getAge());
		}
		System.out.println("done");
		
	}
}
