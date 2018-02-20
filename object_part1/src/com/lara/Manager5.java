package com.lara;
class E
{
	int i,j;
	E(int i,int j)
	{
	this.i=i;
	this.j=j;
	}
	public String toString()
	{
	return "i="+i+"&j="+j;
	}
}

class Manager5
{

	public static void main(String[] args) 
	{
		E e1=new E(1,2);
		E e2=new E(11,25);
		System.out.println(e1);
		System.out.println(e2);
	}
}
