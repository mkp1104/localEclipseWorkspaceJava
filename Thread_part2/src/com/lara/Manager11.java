package com.lara;
import java.util.Scanner;
class J extends Thread
{
public void run()
	{
		int counter=0;
		while(!this.isInterrupted())
		{
		counter++;
		System.out.println(counter);
		try
		{
			sleep(1000);
		}
		catch (InterruptedException ex)
		{
			System.out.println(ex);
		break;
		}
		}
	}
}
public class Manager11
{
public static void main(String args[])
	{
J obj=new J();
obj.start();
Scanner sc=new Scanner(System.in);
String decider;
do
{
	try
	{
		Thread.sleep(200);
	}
	catch (InterruptedException ex)
	{
		System.out.println(ex);
	}
	System.out.println("want to continue ? (y/n)");
	decider =sc.next();
}
while ("y".equals(decider));
obj.interrupt();
	}
}
