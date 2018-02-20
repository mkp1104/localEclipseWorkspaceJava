package com.lara;
class A
{
static  
		{
			System.out.println("SIB");
		}
	int i;
	static int j=10;
}  
class Manager1
{


	public static void main(String[] args) 
	{
		A a1=new A();
		a1.i=20;
		System.out.println(a1.i);
		System.out.println(a1.j);
		System.out.println(A.j);

	
	}
}