package com.lara;
import java.util.ArrayList;
public class Manager5
{
	public static void main(String[] args) 
	{
		ArrayList list1=new ArrayList();
		list1.add(90);
		list1.add(0);
		list1.add("abc");
		System.out.println(list1);
		list1.add("xyz");
		System.out.println(list1);
		list1.add(2,"check");//it will replace the value at index 2. 
		System.out.println(list1);
		list1.set(2, 123);
		System.out.println(list1);
		list1.remove(0);
		System.out.println(list1);
		list1.remove("abc");
		System.out.println(list1);
	}
}