package com.lara;
import java.util.TreeMap;
import java.util.Comparator;
class D implements Comparable
{
	int i;
	D(int i)
	{
	this.i=i;
	}
	public int hashCode()
	{	
	return Integer.toString(i).hashCode();	
	}
	public int compareTo(Object obj)
	{
		return i-((D)obj).i;
		
	}
	public boolean equals(Object obj)
	{
		return i==((D)obj).i;
		
	}
	public String toString()
	{
		return "(i="+i+")";
		
	}
}
//{(i=0)=abc5, (i=9)=abc3, (i=80)=abc6, (i=90)=abc4}
public class Manager7
{
	public static void main(String[] args) 
	{
		TreeMap map=new TreeMap();
		map.put(new D(9),"abc1");
		map.put(new D(9),"abc2");
		map.put(new D(9),"abc3");
		map.put(new D(90),"abc4");
		map.put(new D(0),"abc5");
		map.put(new D(80),"abc6");
		System.out.println(map);
				}
}

		

