package com.lara;
import org.hibernate.Session;
@SuppressWarnings("deprecation")
public class Manager1 {

	public static void main(String args[])
	{
	Session s1=Util.openSession();
		System.out.println("done");
		Reaction p1=(Reaction)s1.load(Reaction.class,1);
		System.out.println(p1.getId()+"-"+p1.getFirstName()+"-"+p1.getLastName()+"-"+p1.getAge());
		System.out.println(p1.getAge());		
		System.out.println("done");
		s1.evict(p1);
		s1.clear();
		Reaction p2=(Reaction)s1.load(Reaction.class,1);
		System.out.println(p2.getId()+"-"+p2.getFirstName()+"-"+p2.getLastName()+"-"+p1.getAge());
		System.out.println(p2.getAge());		
		System.out.println("done");
		Reaction p3=(Reaction)s1.load(Reaction.class,1);
		System.out.println(p3.getId()+"-"+p3.getFirstName()+"-"+p3.getLastName()+"-"+p1.getAge());
		System.out.println(p3.getAge());		
		System.out.println("done");
		s1.flush();
		s1.close();
	}
}
