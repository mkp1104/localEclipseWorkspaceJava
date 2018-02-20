package com.lara;
import java.util.TreeSet;
import java.util.HashSet;
import java.lang.Comparable;

	class K implements Comparable
	{
		int x;
		K(int x)
		{
			this.x=x;
			
		}
		public String toString()
		{
			return "x="+ x;
		}
		public int compareTo(Object obj)
		{
			return x-((K)obj).x;
			
		}
	}
		
public class Manager28 {

public static void main(String args[])
	{
		TreeSet set=new TreeSet();
	set.add(new K(9));
	set.add(new K(1));
	set.add(new K(5));
	set.add(new K(4));
	System.out.println(set);
	}
}