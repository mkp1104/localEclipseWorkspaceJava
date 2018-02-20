package com.lara;
import java.util.TreeMap;
import java.util.Comparator;
class C
{
	int i,j;
	C(int i,int j)
	{
	this.i=i;
	this.j=j;
	}
	public String toString()
	{
	return "("+i+","+j+")";
	}
	
 
static class D implements Comparator
{
	public int compare(Object o1,Object o2)
	{
	return ((C)o1).i-((C)o2).i;
	}
}
static class E implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		return ((C)o1).j-((C)o1).j;
	}
}
}
public class Manager6
{
	public static void main(String[] args) 
	{
		TreeMap map=new TreeMap(new C.D());
		map.put(new C(1,2),9);
		map.put(new C(0,10),19);
		map.put(new C(1,8),92);
		map.put(new C(8,0),91);
		map.put(new C(5,4),39);
		System.out.println(map);
		TreeMap map1=new TreeMap(new C.E());
		map1.put(new C(9,1),9);
		map1.put(new C(0,10),19);
		map1.put(new C(1,8),92);
		map1.put(new C(8,0),91);
		map1.put(new C(5,4),39);
		System.out.println(map1);
		}
}

		

