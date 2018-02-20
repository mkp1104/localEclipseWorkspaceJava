package com.lara;
class C
{
	int i;
	C(int i)
	{
	this.i=i;
	}
}
public class Manager2
{

	public static void main(String[] args) 
	{
		C c1=new C(10);
		C c2=new C(10);
		System.out.println(c1==c2);
		System.out.println(c1.equals(c2));
	}
}
