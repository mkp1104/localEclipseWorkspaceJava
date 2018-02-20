package com.lara;
import java.util.PriorityQueue;
public class Manager8 {
	public static void main(String args[])
	{
	PriorityQueue pq=new PriorityQueue();
	pq.add(9);
	pq.add(91);
	pq.add(19);
	pq.add(92);
	pq.add(29);
	pq.add(93);
	pq.add(4);
	pq.add(5);
System.out.println("1:"+pq);
System.out.println(pq.poll());
System.out.println("2:"+pq);
System.out.println(pq.poll());
System.out.println("3:"+pq);
System.out.println(pq.poll());
System.out.println("4:"+pq);
System.out.println(pq.poll());
System.out.println("5:"+pq);
}
}