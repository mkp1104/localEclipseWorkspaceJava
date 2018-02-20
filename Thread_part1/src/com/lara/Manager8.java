package com.lara;
class  F extends Thread
{
	public void run()
	{
	for (int i=0;i<5 ;i++ )
	{
		System.out.println(i);
	//	start();
		}
	}
}
public class Manager8
{

	public static void main(String[] args) 
	{
		F f1=new F();
		f1.start();
		for (int i=6;i<10 ;i++ )
		{
	System.out.println(i);

		}
		}
}
