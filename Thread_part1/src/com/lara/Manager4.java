package com.lara;
class D1
{
	int i;
	D1(int i)
	{
	
	this.i=i;
	}
}  
public class Manager4
{


	public static void main(String[] args) 
	{
		D1 d1=new D1(90);
		D1 d2=new D1(90);
		D1 d3=d2;
		D1 d4=d1;
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);

	
	}
}