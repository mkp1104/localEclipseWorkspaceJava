package com.lara;
import java.util.Vector;
class A extends Thread
{
	Vector v2=null;

	public  void set(Vector v1)
	{
		v2=v1;
		
	}
public void run()
{


	System.out.println("From Class A");

for(int i=0;i<10;i++)
{
v2.add(i);	
System.out.println(v2);
}
}
}
class B extends Thread
{
	Vector v2=null;
	public  void set(Vector v1)
	{
		v2=v1;
		
	}
public void run()
{

	System.out.println("From Class B");
for(int i=10;i<20;i++)
{
v2.add(i);	
System.out.println(v2);
}
}
}

public class T2 

{
	public static void main(String[] args) 
{

Vector v=new Vector();

A a=new A();
a.set(v);
B b=new B();
b.set(v);
System.out.println("T2-Begin");
a.start();
b.start();
System.out.println("T2-End");
}	
}
