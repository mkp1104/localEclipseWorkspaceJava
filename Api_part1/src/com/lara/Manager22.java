package com.lara;
import java.util.ArrayList;
class B
{
int i;
B(int i)
{
this.i=i;	
}
public String toString()
{
return "i="+i;	
}
}
public class Manager22
{
	public static void main(String[] args) 
	{
		ArrayList list1=new ArrayList();
		list1.add(new B(9));
		list1.add(new B(4));
		list1.add(new B(5));
		list1.add(new B(2));
		System.out.println(list1);
		}
	}