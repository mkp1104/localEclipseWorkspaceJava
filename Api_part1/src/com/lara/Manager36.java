package com.lara;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.ListIterator;
public class Manager36
{
	public static void main(String[] args) 
	{
		ArrayList list1=new ArrayList();
		list1.add(90);
		list1.add(9);
		list1.add(0);
		list1.add(40);
		ListIterator lit=list1.listIterator();

		while(lit.hasNext())
		{
			System.out.println(lit.next()+",");
			
		}
		while(lit.hasPrevious())
		{
			
			System.out.println(lit.previous()+",");
		}
		while(lit.hasNext())
		{
			System.out.println(lit.next()+",");
			
		}
		}
}
