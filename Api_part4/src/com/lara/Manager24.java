package com.lara;
import java.util.TreeSet;
import java.util.HashSet;

public class Manager24 {
	public static void main(String args[])
	{
		HashSet set=new HashSet();
	set.add(90);
	set.add(0);
	set.add(9);
	set.add(19);
	set.add(16);
	set.add(6);
	
	set.add(18);
	System.out.println(set.size());
	System.out.println(set);
	TreeSet set1=new TreeSet(set);
	System.out.println(set1);
	}
}