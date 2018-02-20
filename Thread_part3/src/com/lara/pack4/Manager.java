package com.lara.pack4;
class  A
{
	
	synchronized void test1()
	{ 
		System.out.println("test1 Begin");
		try
		{
			wait();
		}
		catch (InterruptedException ex)
		{
			ex.printStackTrace();
		}
		System.out.println("test 1 end");
	}
	synchronized void test2()
	{
//	notify();
	notifyAll();
	}
}
class Thread1 extends Thread
{
A a1;
Thread1(A a1)
	{
		this.a1=a1;
	}
	public void run()
	{
	a1.test1();
	}
}
class Thread2 extends Thread
{
A a1;
Thread2(A a1)
	{
		this.a1=a1;
	}
	public void run()
	{
	a1.test1();
	}
}
	
public class Manager
{

	public static void main(String[] args) 
	{
		A a1=new A();
Thread1 t1=new Thread1(a1);
Thread2 t2=new Thread2(a1);
	t1.start();
	t2.start();
	try
	{
		Thread.sleep(2000);
	}
	catch (InterruptedException ex)
	{
		ex.printStackTrace();
	}
	System.out.println("about to release!!!!");
	a1.test2();
//	new A().test2();
//	A a2=new A();
//	a2.test2();
	}
}