package com.lara;
class  D extends Thread
{
	public void run()
	{
	for (int i=0;i<5 ;i++ )
	{
		System.out.println(i);
		}
	}
}
public class Manager61
{

	public static void main(String[] args) 
	{
		D d1=new D();
		d1.start();
//		d1.start();
		D d2=new D();
		d2.start();
		for (int i=6;i<10 ;i++ )
		{
	System.out.println(i);

		}
		}
}