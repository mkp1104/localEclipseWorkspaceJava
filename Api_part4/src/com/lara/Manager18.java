package com.lara;
import java.util.Iterator;
import java.util.HashSet;
class A
{
int i;
A(int i)
{
this.i=i;	
}
}
public class Manager18 {
	public static void main(String args[])
	{
		HashSet set=new HashSet();
	set.add("abc");
	set.add("abc");
	System.out.println(set);	
	HashSet set2=new HashSet();
set2.add(90);
set2.add(90);
System.out.println(set2);
HashSet set3=new HashSet();
set3.add(true);
set3.add(true);
System.out.println(set3);
HashSet set4=new HashSet();
set4.add(new StringBuffer("abc"));//Here toString m()  is overriden in StringBuffer()!!!
set4.add(new StringBuffer("abc"));
System.out.println(set4);
HashSet set5=new HashSet();
set5.add(new A(10));//Here toString m()  is not overriden in class A !!!
set5.add(new A(10));
System.out.println(set5);	
}
}