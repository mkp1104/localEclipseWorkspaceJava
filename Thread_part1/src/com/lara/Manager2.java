package com.lara;
class B
{
	int i;
	B(int i)
	{
	
	this.i=i;
	}
}  
class Manager2
{
	public static void main(String[] args) 
	{
		B b1=new B(10);
		String  s1=b1.toString();
		System.out.println(s1);
		System.out.println(b1.toString());
		System.out.println(b1);
	
	}
}