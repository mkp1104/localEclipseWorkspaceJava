package com.lara;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.ListIterator;

	public class Manager40
	{
	public static void main(String[] args) 
	{
		
		ArrayList list1=new ArrayList();
		list1.add(90);
		list1.add(0);
		list1.add(9);
		list1.add(91);
		list1.add(8);
		list1.add(7);
		ListIterator it=list1.listIterator();
		while(it.hasNext())
		{
			Object obj=it.next();
			if(obj.equals(91))
			{
			it.set("abc");	
			}
			it.add(50);
			System.out.println(obj+",");
			}
		
		System.out.println(list1);
	}
}