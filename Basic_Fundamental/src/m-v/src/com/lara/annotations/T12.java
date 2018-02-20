package com.lara.annotations;


class T12

{
	int i=12;
	float j=19;
	T12(int i,float j)
	{
	System.out.println("int ,float");
		
	}
	public static void main(String args[])
		{
		T12 t=new T12(10,1.90);
		System.out.println(t.i);
		System.out.println(t.j);
		}
}