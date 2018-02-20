package com.lara;
import java.util.ArrayList;
import java.util.Collections;
public class Manager27
{
	public static void main(String[] args) 
	{
		ArrayList list1=new ArrayList();
		list1.add("blue");
		list1.add("yellow");
		list1.add("indigo");
		list1.add("red");
		Collections.sort(list1);
		System.out.println(list1);
		int i=Collections.binarySearch(list1,"voilet");
		System.out.println(i);
	}
}
