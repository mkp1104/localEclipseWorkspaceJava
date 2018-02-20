package com.lara;
import java.util.Arrays;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
public class Manager9 {

	public static void main(String args[])
	{
		Session s1=Util.openSession();
		Query query=s1.createQuery("select firstName,lastName from com.lara.Person");
		List<Object[]> list3=query.list();
		for (Object[] p1 : list3) 
		{
			System.out.println(Arrays.toString(p1));
		}
		System.out.println("done");
		
	}
}
