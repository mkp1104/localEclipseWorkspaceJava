package com.lara;
import java.util.LinkedList;
public class Manager4 {
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
Object obj=list.removeLast();
//list.remove();
//list.remove(index);
//list.remove(Object o);
//list.removeAll(c);
//list.removeFirst();
//list.removeFirstOccurrence(Object);
//list.removeLast();
//list.removeLastOccurrence(Object);
//list.retainAll(list);

System.out.println(obj);

System.out.println(list);//working just like a Queue!!!!
Object obj1=list.removeLast();
System.out.println(obj1);
System.out.println(list);
System.out.println(list.removeLast());
	
	System.out.println(list);
}
}