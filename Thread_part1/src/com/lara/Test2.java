package com.lara;
 
//Without a abstarct class also can be treated as annanumus inner class!!!!

class P1
{
 public void run1()
 {}
}

public class Test2 
{
public static void main(String[] args) 
{
//	We can make an annanamus inner class of non abstract class or methods also.....
	
P1 p1=new P1()
{
	public void run1()

{
	
for (int i = 0; i < 5; i++) {
	System.out.println(i);
}
}
};
}
}
