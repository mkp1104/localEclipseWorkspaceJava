package com.lara;
import java.util.Arrays;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
public class Manager6 {

	public static void main(String args[])
	{
		Session s1=Util.openSession();
		String q1="select * from person";
		List<Object[]> list2=s1.getNamedQuery("q1").list();
	//	List<Object[]> list2=s1.getNamedQuery("q2").list();
	//	List<Object[]> list2=s1.getNamedQuery("q3").setInteger("param1",22).list();
	//	List<Object[]> list2=s1.getNamedQuery("q4").setInteger("param1",21).setString("param2", "hello").list();
		for (Object[] row : list2) 
		{
			System.out.println(Arrays.toString(row));
		}
		
		
		System.out.println("done");
		
	}
}
