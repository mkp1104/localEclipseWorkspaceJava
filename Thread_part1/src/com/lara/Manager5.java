package com.lara;
class E1
{
	int i;
	int j;
	E1(int i,int j)
	{
	
	this.i=i;
	this.j=j;
	}
	public String toString()
	{
		return "i="+i+"&j="+j;
	}
}  
public class Manager5
{


	public static void main(String[] args) 
	{

		E1 e1=new E1(1,2);
		E1 e2=new E1(11,25);
		System.out.println(e1);
		System.out.println(e2);
	
	}
}