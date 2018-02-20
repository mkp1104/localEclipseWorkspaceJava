package com.lara.pack9;
class Util
{
	static void sleep(long millis)
	{
	try
	{
		Thread.sleep(millis);
	}
	catch (InterruptedException ex)
	{
		System.out.println(ex);
	}
	}
}
class Test
{
	int i;
}
class A extends Thread
{
	Test t;
	A(Test t)
	{
	this.t=t;
	}
	public  void run()
	{
		System.out.println("1:"+t.i);
		t.i=10;
		Util.sleep(500);
		System.out.println("2:"+t.i);
		t.i=20;
		Util.sleep(500);
		System.out.println("3:"+t.i);
		t.i=30;
		Util.sleep(500);		
		System.out.println("4:"+t.i);
		t.i=40;
		Util.sleep(500);
	}
}
class B extends Thread
{
	Test t;
	B(Test t)
	{
	this.t=t;
	}
	public 	void run()
	{
		System.out.println("5:"+t.i);
		t.i=50;
		Util.sleep(500);
		System.out.println("6:"+t.i);
		t.i=60;
		Util.sleep(500);
		System.out.println("7:"+t.i);
		t.i=70;
		Util.sleep(500);
		System.out.println("8:"+t.i);
		t.i=80;
		Util.sleep(500);
	}
}

public class Manager
{
	public static void main(String[] args) 
	{
		Test t1=new Test();
		t1.i=90;
		A a1=new A(t1);
		a1.start();
		Util.sleep(250);
		B b1=new B(t1);
		b1.start();
		Util.sleep(4000);
		System.out.println("9:"+t1.i);
	}
}