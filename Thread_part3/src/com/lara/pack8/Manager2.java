package com.lara.pack8;
class A1 extends Thread
{
	public void run()
	{
	for (int i=0;i<20 ;i++ )
	{
		System.out.println(i);
	}
	}
}  
public class Manager2
{
	public static void main(String[] args) 
	{
		A1 a1=new A1();
		System.out.println("a:"+a1.getState());
		a1.start();
		System.out.println("b:"+a1.getState());
		try
		{
			Thread.sleep(1);
		}
		catch (InterruptedException ex)
		{
			ex.printStackTrace();
		}
		System.out.println("c:"+a1.getState());
		try
		{
			Thread.sleep(1000);
		}
		catch (InterruptedException ex)
		{
			ex.printStackTrace();
		}
	System.out.println("d:"+a1.getState());
	}
}
