package com.lara;
class L
{
	int i;
}

class M
{
	int i;

	public boolean equals(Object obj)
	{
		M myObj=(M)obj;
	return i== myObj.i;
	}
}
public class Manager8
{

	public static void main(String[] args) 
	{
		L obj1=new L();
		L obj2=new L();
		M obj3=new M();
		M obj4=new M();
		obj1.i=10;
		obj2.i=10;
		obj3.i=10;
		obj4.i=10;
		System.out.println(obj1.equals(obj2));
		System.out.println("--------"); 
		System.out.println(obj3.equals(obj4)); 
		System.out.println("--------"); 
		System.out.println(obj1.equals(obj3)); 
		System.out.println("--------"); 
		System.out.println(obj3.equals(obj1));  
	}
}