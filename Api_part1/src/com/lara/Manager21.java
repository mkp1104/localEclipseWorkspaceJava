package com.lara;
import java.util.ArrayList;
class A
{
int i;
A(int i)
{
this.i=i;	
}
}
public class Manager21
{
	public static void main(String[] args) 
	{
		ArrayList list1=new ArrayList();
		list1.add("abc");
		list1.add(90);
		list1.add(new A(100));
		list1.add(new A(200));
		System.out.println(list1);
		}
	}