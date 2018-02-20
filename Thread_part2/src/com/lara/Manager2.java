package com.lara;
class B1 implements Runnable
{
	public void run()
	{
	for (int i=0;i<10 ;i++ )
	{
		System.out.println(i);
		try
		{
			Thread.sleep(1000);
		}
		catch (InterruptedException ex )
		{
			System.out.println(ex);
		}
	}
}

}
public class Manager2


{
	public static void main(String[] args) 
	{
		B1 b1=new B1();
		Thread t1=new Thread(b1);
		t1.start();
		for (int i=10;i<20 ;i++ )
		{
			System.out.println(i);
			try
			{
				Thread.sleep(1000);
//				there is no guarantee that this 
//				thread will execute after 1000 mili
//				second,it will be only wakeup.  
			}
			catch (InterruptedException ex)
			{
				System.out.println(ex);
			}
		}
		System.out.println("done");
	}
}
