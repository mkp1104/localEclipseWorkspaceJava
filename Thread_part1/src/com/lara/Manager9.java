package com.lara;
	class  G extends Thread
{
	public void run()
	{
	for (int i=0;i<5 ;i++ )
	{
		System.out.println(i);
		}
	}
	void startThread()
	{
	start();
	}
}
public class Manager9
{

	public static void main(String[] args) 
	{
		G g1=new G();
		g1.startThread();
		for (int i=6;i<10 ;i++ )
		{
	System.out.println(i);

		}
		}
}
