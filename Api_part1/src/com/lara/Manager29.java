package com.lara;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class Manager29
{
	public static void main(String[] args) 
	{
		ArrayList list1=new ArrayList();
		list1.add(9);
		list1.add(0);
		list1.add(5);
		list1.add(4);
		list1.add(19);
		list1.add(90);
		list1.add(29);
		list1.add(5);
		System.out.println(Collections.max(list1));
		System.out.println(Collections.min(list1));
	}
}
