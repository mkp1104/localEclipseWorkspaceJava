package com.mkp.interview;
import java.util.Arrays;
import java.util.Comparator;

class Person
{
	String name;
	int age;
	double weight;
	Person(String name,int age,double weight)
	{
	this.name=name;
	this.age=age;
	this.weight=weight;
	}
	public String toString()
	{
	return "("+name+","+age+","+weight+")";
	}
 
static class SortBaseOnAge implements Comparator
{
	public int compare(Object o1,Object o2)
	{
	Person p1=(Person)o1;
	Person p2=(Person)o2;
	return p1.age-p2.age;
	}
}
static class SortBaseOnName implements Comparator
{
	public int compare(Object o1,Object o2)
	{
	Person p1=(Person)o1;
	Person p2=(Person)o2;
	return p1.name.compareTo(p2.name);
	}
}
static class SortBaseOnWeight implements Comparator
{
public int compare(Object o1,Object o2)
	{
		Person p1=(Person)o1;
		Person p2=(Person)o2;
		return (int)(p1.weight-p2.weight);
	}
}
}

public class Manager8
{
	public static void main(String[] args)
	{
		Person []x={
			new Person("ramu",22,55.09),
			new Person("kiran",32,65.09),
			new Person("pavan",23,45.09),
			new Person("vijay",27,50.09)};
		System.out.println(Arrays.toString(x));
		Arrays.sort(x,new Person.SortBaseOnName());
		System.out.println(Arrays.toString(x));
	Arrays.sort(x,new Person.SortBaseOnAge());
		System.out.println(Arrays.toString(x));
			Arrays.sort(x,new Person.SortBaseOnWeight());
System.out.println(Arrays.toString(x));
		
		}
}
