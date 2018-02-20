package com.lara;
import java.util.PriorityQueue;
class A implements Comparable
{
int i;
A(int i)
{
this.i=i;	
}
public String toString()
{
return Integer.toString(i);	
}
public int compareTo(Object obj)
{
return i-((A)obj).i;	
}
}
public class Manager11
{
	public static void main(String[] args) 
	{
		PriorityQueue pq=new PriorityQueue();
		pq.add(new A(9));
		pq.add(new A(5));
		pq.add(new A(8));
		pq.add(new A(29));
		pq.add(new A(90));
		pq.add(new A(19));
		pq.add(new A(1));
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq);
		}
	}