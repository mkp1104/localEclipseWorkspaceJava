package com.mkp.interview;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class F
{
	int i,j;
	F(int i,int j)
	{
	this.i=i;
	this.j=j;
	}
	public String toString()
	{
	return "("+i+","+j+")";
	}
	
} 
class G implements Comparator
{
	public int compare(Object o1,Object o2)
	{
	F f1=(F)o1;
	F f2=(F)o2;
	return f1.i-f2.i;
	}
}
 
class H implements Comparator
{
	public int compare(Object o1,Object o2)
	{
	F f1=(F)o1;
	F f2=(F)o2;
	return f1.j-f2.j;
	}
}
public class Manager26
{
	public static void main(String[] args) 
	{
		ArrayList list1=new ArrayList();
		list1.add(new F(1,0));
		list1.add(new F(6,2));
		list1.add(new F(0,8));
		list1.add(new F(2,5));
		list1.add(new F(5,1));
		System.out.println(list1);
		Collections.sort(list1,new G());
		System.out.println(list1);
		Collections.sort(list1,new H());
		System.out.println(list1);
	}
}

		

