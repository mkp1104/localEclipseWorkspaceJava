package com.lara;
class C
{
	int i;
	C(int i)
	{
	this.i=i;
	}
	public String toString()
	{
	return "i="+i;
	}
}

class Manager3
{

	public static void main(String[] args) 
	{
		C c1=new C(90);
		System.out.println(c1);
		C c2=new C(20);
		System.out.println(c2);
	}
}
