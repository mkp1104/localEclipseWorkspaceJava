package com.lara;
import java.util.TreeSet;
import java.util.Collections;
public class Manager26 {
	public static void main(String args[])
	{
	
	TreeSet set=new TreeSet(Collections.reverseOrder());
	set.add(9.9);
	set.add(0.9);
	set.add(9.4);
	set.add(4.5);
	set.add(5.6);
	set.add(8.5);
	set.add(0.6);
	set.add(1.5);
	System.out.println(set);
	
	}
}