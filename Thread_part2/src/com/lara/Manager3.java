package com.lara;
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
class C extends Thread
{
	public void run()
	{
	for (int i=0;i<20 ;i++ )
	{
		System.out.println(i);
		Util.sleep(1000);
	}
	}
}
class D implements Runnable
{
	public void run()
	{
	for (int i=20;i<40 ;i++ )
	{
		System.out.println(i);
		Util.sleep(1000);
	}
	}
}
public class Manager3
{

	public static void main(String[] args) 
	{
		C c1=new C();
		c1.start();
		D d1=new D();
		Thread t1=new Thread(d1);
		t1.start();
		for (int i=40;i<60 ;i++ )
		{

			System.out.println(i);
			Util.sleep(1000);
		}
	}
}