package com.lara;
import java.util.ArrayList;
import java.util.Collections;
class D implements Comparable
{
int i;
D(int i)
{
this.i=i;	
}
public String toString()
{
return "i="+i;	
}
public int compareTo(Object obj)
{
return i-((D)obj).i;	
}
}
public class Manager24
{
	public static void main(String[] args) 
	{
		ArrayList list1=new ArrayList();
		list1.add(new D(9));
		list1.add(new D(0));
		list1.add(new D(8));
		list1.add(new D(2));
		list1.add(new D(5));
		System.out.println(list1);
		Collections.sort(list1);
		System.out.println(list1);
		}
	}