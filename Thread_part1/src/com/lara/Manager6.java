package com.lara;
class C implements Runnable
{
	public void run()
	{
	for(int i=100;i<105;i++)
		{
			System.out.println(i);
		}
	}
}  
public class Manager6
{


	public static void main(String[] args)
	{

		C c1=new C();
		Thread t1=new Thread(c1);
		t1.start();
		for(int i=6;i<10;i++)
		{
		System.out.println(i);
		//System.out.println(c1);
		}
	}
}