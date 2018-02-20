package com.lara;
public class  A implements Cloneable
{
	int i;
	public static void main(String[] args) throws CloneNotSupportedException 
	{
		A a1=new A();
		System.out.println(a1);
		a1.i=10;
		A a2=(A)a1.clone();
		System.out.println(a2.i);
		System.out.println(a2);
	}
}