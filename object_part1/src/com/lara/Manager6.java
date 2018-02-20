package com.lara;
class F
{
	String s1;
	int i;
	F(String s1,int i)
	{
	this.s1=s1;
	this.i=i;
	}
	public String toString()
	{
	return "s1="+s1+",i="+i;
	}
}

class Manager6
{

	public static void main(String[] args) 
	{
		F f1=new F("abc",22);
		F f2=new F("abc",22);
		System.out.println(f1);
		System.out.println(f2);
	}
}
