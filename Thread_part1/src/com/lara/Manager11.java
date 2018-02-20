package com.lara;
class I extends Thread
{

	public void run()
	{
		for ( int i=0;i<10 ;i++ )
		{
			System.out.println(i);
		}
	}
}
public class Manager11
{

	public static void main(String[] args) 
	{
		I obj=new I();
		obj.run();
		obj.start();
		for (int i=10;i<20 ;i++ )
		{
		System.out.println(i);
		}
		
	}
}