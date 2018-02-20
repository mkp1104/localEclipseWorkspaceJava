package com.lara;
import java.util.ArrayList;
class A1 extends Thread
{
	ArrayList v2=null;

	public  void set(ArrayList v1)
	{
		v2=v1;
		
	}
public void run()
{


	System.out.println("From Class A");

for(int i=0;i<10;i++)
{
v2.add(i);	
try
{
Thread.sleep(500);
}

catch(InterruptedException e)
{
	
}
System.out.println(v2);
}
}
}
class B1 extends Thread
{
	ArrayList v2=null;
	public  void set(ArrayList v1)
	{
		v2=v1;
		
	}
public void run()
{

	System.out.println("From Class B");
for(int i=10;i<20;i++)
{
v2.add(i);	
try
{
Thread.sleep(500);
}

catch(InterruptedException e)
{
	
}System.out.println(v2);
}
}
}

public class T3 

{
	public static void main(String[] args) 
{

ArrayList v=new ArrayList();

A1 a=new A1();
a.set(v);
B1 b=new B1();
b.set(v);
System.out.println("T3-Begin");
a.start();
b.start();
try
{
Thread.sleep(500);
}

catch(InterruptedException e)
{
	
}
System.out.println("T3-End");
}	
}
