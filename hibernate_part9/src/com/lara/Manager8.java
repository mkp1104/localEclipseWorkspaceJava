package com.lara;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
public class Manager8 
{
public static void main(String[] args) 
{
	Session s1=Util.openSession();
//	String sql1="select * from person";
	String sql2="select * from address";
	Query query=s1.createSQLQuery(sql2);
	List<Object[]> list=query.list();	
	for (Object column : list) 
	{
	System.out.println(column);	
	}
	System.out.println("-------");
}
/*String sql3="select * from person";
List<String> list1=s1.createSQLQuery(sql3).list();
for(String str:list1)
{
System.out.println(str);	
System.out.println("------");	
}*/
//String sql4="select firstName,age from Person";
/*List<Object[]> list2=s1.createSQLQuery(sql4).list();
for (Object[] row : list2) 
{
	for (Object column : row) 
		{
		System.out.println(column);	
		}
}*/
}

