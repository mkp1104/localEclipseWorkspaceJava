package com.lara;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.ListIterator;
public class Manager30
{
	public static void main(String[] args) 
	{
		ArrayList list1=new ArrayList();
		list1.add(9);
		list1.add(4);
		list1.add(5);
		list1.add(0);
		list1.add(2);
		System.out.println(list1);
		System.out.println("----");
		Iterator it=list1.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next()+",");
			
		}
		while(it.hasNext())
		{
			System.out.println(it.next()+",");
			
		}
		System.out.println();
		/*
		 *Iterator->hasNext(),remove(),next() + 9 methods of Object Class(equals(obj),wait(),wait(timed),wait(timed,nanosec),notify(),notifyAll(),toString(),hashCode(),getClass())=12 methods
		 *ListIterator->hasNext(),hasPrevious(),next(),previous(),set(),remove(),add(),nextIndex(),previousIndex()+ 9 method of Object Class=18 methods.
		 */
	
	ListIterator lit=list1.listIterator();
	while(lit.hasNext())
	{
		System.out.println(lit.next()+",");
		
		
	}
}
}
