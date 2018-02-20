package com.lara;
import java.util.ArrayList;
public class Manager2
{
	public static void main(String[] args) 
	{
		ArrayList list1=new ArrayList();
		list1.add(90);
		list1.add(true);
	//	int i=(int)list1.get(0);//index as a argument.
		int i=(int)list1.get(0);//index as a argument. and return type object!!!!
	//	System.out.println(list1.get(1)); it is Possible also.
		boolean flag=(Boolean)list1.get(1);
		System.out.println(i);
		System.out.println(flag);
	}
}
