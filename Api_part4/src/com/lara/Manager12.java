package com.lara;
import java.util.PriorityQueue;
import java.util.Comparator;
class B
{
	int i,j;
	B(int i,int j)
	{
	this.i=i;
	this.j=j;
	}
	public String toString()
	{
	return "("+i+","+j+")";
	}
	
} 
class C implements Comparator
{
	public int compare(Object o1,Object o2)
	{
	return ((B)o1).i-((B)o2).i;
	}
}
 
class D implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		return ((B)o1).j-((B)o1).j;
	}
}
public class Manager12
{
	public static void main(String[] args) 
	{
		PriorityQueue pq=new PriorityQueue(10,new C());
		pq.add(new B(1,2));
		pq.add(new B(10,0));
		pq.add(new B(5,8));
		pq.add(new B(0,10));
		pq.add(new B(2,5));
		pq.add(new B(8,6));
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq);
		System.out.println(pq.poll());
		PriorityQueue pqp=new PriorityQueue(10,new D());
		pqp.add(new B(1,2));
		pqp.add(new B(10,0));
		pqp.add(new B(5,8));
		pqp.add(new B(0,10));
		pqp.add(new B(2,5));
		pqp.add(new B(8,6));
		System.out.println(pqp);
		System.out.println(pqp.poll());
		System.out.println(pqp);
		System.out.println(pqp.poll());
		System.out.println(pqp);
		System.out.println(pqp.poll());
		System.out.println(pqp);
	}
}