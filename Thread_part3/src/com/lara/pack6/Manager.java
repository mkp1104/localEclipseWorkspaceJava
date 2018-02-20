package com.lara.pack6;

class A
{
	void test1()
	{
		System.out.println("some stmt");
	synchronized(this)
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
	}

void test2()
	{
		synchronized(this)
		{
//			there are 3 thread with 3 different object of same kind 
//			so,notifyAll() is called on specific object then only all
//			thread on same object reference will be released .
		notifyAll();
		}
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
	System.out.println("run begin");
	obj.test1();
	System.out.println("run end");
	}
}
public class Manager
{
	public static void main(String args[])
	{
	A a=new A();
	A a1=new A();
	A a2=new A();
	B b=new B(a);
	B b1=new B(a1);
	B b2=new B(a2);
	b.start();
	b1.start();
	b2.start();
	try
	{
		Thread.sleep(10000);
	}
	catch (InterruptedException ex)
	{
		ex.printStackTrace();
	}
	System.out.println("about to release!!!!!!!!");
	a.test2();
	}
} 
	