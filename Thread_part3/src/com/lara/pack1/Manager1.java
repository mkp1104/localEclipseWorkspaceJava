package com.lara.pack1;
class  A
{
	synchronized void test1()
	{
		for (int i=0;i<10 ;i++ )
		{
			System.out.println(i);
		}
	
	}
	synchronized void test2()
	{
	for (int i=10;i<20 ;i++ )
	{
		System.out.println(i);
		System.out.println("----------------------------------------------------");
	}
	}
}
class B extends Thread
{
	A a1;
	B(A a1)
	{
	this.a1=a1; 
	}
	public void run()
	{
    a1.test1();
	

    
    //	a1.test2();
	}
}
class C extends Thread
{
	A a1;
	C(A a1)
	{
	this.a1=a1;
	}
	public void run()
	{
a1.test2();
//	a1.test1();
	}
}
public class Manager1
{

	public static void main(String[] args) 
	{
	A a1=new A();
	A a2=new A();
//	B b1=new B(a1);
	B b2=new B(a2);
//	C c1=new C(a1);
	C c1=new C(a1);
	c1.start();
	b2.start();

//	b1.start();
		
	}
}