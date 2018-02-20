package com.lara;
import java.util.LinkedList;
public class Manager5 {
	public static void main(String args[])
	{
	LinkedList list=new LinkedList();
	list.add("abc");
	list.add("cba");
	list.add("test");
	list.add("hello");
	list.add("java");
	list.add("10");
	
	System.out.println(list);
	System.out.println(list.peek());//by default peek()=peekFirst();
	System.out.println(list);
	System.out.println(list.poll());
	System.out.println(list);
	
	}
}