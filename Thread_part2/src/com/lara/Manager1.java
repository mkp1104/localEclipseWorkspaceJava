package com.lara;
class A extends Thread
{
	public void run()
	{
	for (int i=0;i<10 ;i++ )
	{
		System.out.println(i);
		try
		{
			sleep(100);
		}
		catch (InterruptedException ex )
		{
			ex.printStackTrace();
		}
	}
}

}
public class Manager1


{
	public static void main(String[] args) 
	{
		A a1=new A();
		a1.start();
		
		System.out.println("done");
		
	}
}
