package com.lara;
import java.util.Iterator;
import java.util.HashSet;

public class Manager23 {
	public static void main(String args[])
	{
		HashSet set=new HashSet();
	set.add(123);
	set.add("abc");
	set.add("xyz");
	set.add(123);
	set.add(true);
	set.add('a');
	System.out.println(set.size());
	System.out.println(set);
	Iterator it=set.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next()+",");
		
	}
	}
}