package com.lara;
class C1
{
	int i;
	C1(int i)
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
		C1 c1=new C1(90);
		System.out.println(c1);
		C1 c2=new C1(20);
		System.out.println(c2);
	
	}
}