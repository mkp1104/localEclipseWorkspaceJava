package com.lara;
import java.util.Arrays;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
public class Manager5 {

	public static void main(String args[])
	{
		Session s1=Util.openSession();
		
		String sql="select * from person";
		Query query=s1.createSQLQuery(sql);
		List<Object[]> list1=query.list();
		for (Object[] row  : list1) 
		{
			for (Object column : row) 
			{
				System.out.println(column);
			}
		System.out.println("-----");
		
		}
		
		
		System.out.println("done");
		
	}
}
