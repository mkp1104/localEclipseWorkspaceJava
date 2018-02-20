package com.lara;
class B2
{
	int i;
	B2(int i)
	{
	this.i=i;
	}
}

class Manager1
{

	public static void main(String[] args) 
	{
		A a1=new A();//here A.java file will automatically  compiled by this program....
		a1.i=20;
		System.out.println(a1);
	}
}
