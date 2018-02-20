package com.lara.pack5;

class A
{
	synchronized void test1()
	{
	try
	{
		wait();
	}
	catch (InterruptedException ex)
	{
		ex.printStackTrace();
	}
	}

synchronized void test2()
		{

		//notify();
		  notifyAll();
		}
}
class B extends Thread
{
A obj;
B(A obj)
	{
		this.obj=obj;
	}
	public void run()
	{
	System.out.println("B-run Begin");
	obj.test1();
	System.out.println("B-run End");
	}
} 
class C extends Thread
{
A obj;
C(A obj)
	{
		this.obj=obj;
	}
	public void run()
	{
	System.out.println("C-run Begin");
	obj.test1();
	System.out.println("C-run End");
	}
} 
class D extends Thread
{
	A obj;
	D(A obj)
	{
	this.obj=obj;
	}
	public void run()
	{
	System.out.println("D-run begin");
	obj.test1();
	System.out.println("D-run end");
	}
}
public class Manager
{


	public static void main(String[] args) 
	{
		A a1=new A();
		A a2=new A();
		B b1=new B(a1);
		C c1=new C(a1);
		D d1=new D(a1);
		b1.start();
		c1.start();
		d1.start();
		try
		{
			Thread.sleep(10000);
		}
		catch (InterruptedException ex)
		{
			ex.printStackTrace();
		}
		System.out.println("About to realease!!!!!");
		a1.test2();
	//	a2.test2();
	}
}
