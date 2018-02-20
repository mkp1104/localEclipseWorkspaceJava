package com.lara;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class Manager28
{
	public static void main(String[] args) 
	{
		ArrayList list1=new ArrayList();
		list1.add(20);
		list1.add(10);
		list1.add(30);
		list1.add(23);
		list1.add(49);
		list1.add(15);
		Comparator ctr=Collections.reverseOrder();
		Collections.sort(list1,ctr);
		System.out.println(list1);
		int i=Collections.binarySearch(list1,23,ctr);
		System.out.println(i);
	}
}
