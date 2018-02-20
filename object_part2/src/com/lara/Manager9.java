package com.lara;
class P
{
	int i;
}

class Q
{
	int i;

	public boolean equals(Object obj)
	{
		if(!(obj instanceof Q))
		{
		return false;
		}
		Q myObj=(Q)obj;
	return i== myObj.i;
	}
}
public class Manager9
{

	public static void main(String[] args) 
	{
		P p1=new P();
		P p2=new P();
		Q q1=new Q();
		Q q2=new Q();
		p2.i=10;
		q1.i=10;
		q2.i=10;
		System.out.println(p1.equals(p2)); 
		System.out.println("--------"); 
		System.out.println(q1.equals(q2)); 
		System.out.println("--------"); 
		System.out.println(p1.equals(q2)); 
		System.out.println("--------"); 
		System.out.println(q1.equals(p1));  
	}
}