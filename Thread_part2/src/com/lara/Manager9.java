package com.lara;
class H extends Thread

{
	public void run()
{

	for (int i=0;i<9 ;i++ )
	{
		System.out.println(i);
	}
}
}
public class Manager9
{

	public static void main(String[] args) 
	{
		H obj=new H();
		obj.setDaemon(true);

		obj.start();
		System.out.println("done");
//		obj.start(); Runtime Exception.you can't call start() on same thread more Than 1 time. 

	}
}
