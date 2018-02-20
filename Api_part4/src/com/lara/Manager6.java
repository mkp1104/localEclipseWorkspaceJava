package com.lara;
import java.util.LinkedList;
class Queue
{
private LinkedList list=new LinkedList();	

public void add(Object obj)
{
list.add(obj);	
}
public Object processElement()
{
return list.removeFirst();//OR list.poll()	OR pollFirst() since poll()=pollFirst()
//return list.pollFirst();//OR list.poll()	OR pollFirst()
//return list.poll();	  //OR list.poll()	OR pollFirst()


}
public String toString()
{
return list.toString();	
}
}
public class Manager6 {
	public static void main(String args[])
	{
	Queue q1=new Queue();
	q1.add("abc");
	q1.add("xyz");
	q1.add("hello");
	q1.add(123);
	q1.add("done");
System.out.println(q1);
Object o1=q1.processElement();
System.out.println(o1);

System.out.println(q1);
Object o2=q1.processElement();
System.out.println(o2);
	System.out.println(q1);
}
}