package com.lara;
class I extends Thread

{
	public void run()
{

	for (int i=0;i<10 ;i++ )
	{
		System.out.println(i);
	}
	System.out.println("child Thread end !");
		
}
}
public class Manager10
{

	public static void main(String[] args) 
	{
		I obj=new I();
//		obj.start();
		obj.start();
		try
		{
			obj.join();
		}
		catch (InterruptedException ex)
		{
			
	System.out.println(ex);
		}
		for (int i=10;i<20 ;i++ )
		{
			System.out.println(i);
		}
	}
}