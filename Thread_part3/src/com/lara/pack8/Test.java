package com.lara.pack8;
class util
{
public static void sleep(long millis)
{
try
{
Thread.sleep(millis);	
}
catch(InterruptedException e)
{
System.out.println(e);	
}
}
}
class A extends Thread
{
public void run()
{
System.out.println(1);	
util.sleep(500);
System.out.println(2);	
util.sleep(500);
System.out.println(3);	
util.sleep(500);
System.out.println(4);	
util.sleep(500);
System.out.println(5);	
util.sleep(500);
System.out.println(6);
util.sleep(500);
System.out.println(7);
util.sleep(500);
System.out.println(8);util.sleep(500);	
System.out.println(9);	util.sleep(500);
System.out.println(10);	util.sleep(500);
System.out.println(11);	util.sleep(500);
System.out.println(12);	util.sleep(500);
}
}
class B12 extends Thread
{
public void run()
{
	System.out.println("a");	
	util.sleep(500);
	System.out.println("b");	
	util.sleep(500);
	System.out.println("c");	
	util.sleep(500);
	System.out.println("d");	
	util.sleep(500);
	System.out.println("e");	
	util.sleep(500);
	System.out.println("f");
	util.sleep(500);
	System.out.println("g");
	util.sleep(500);
	System.out.println("h");util.sleep(500);	
	System.out.println("i");	util.sleep(500);
	System.out.println("k");	util.sleep(500);
	System.out.println("l");	util.sleep(500);
	System.out.println("m");	util.sleep(500);	
}
}
public class Test extends Thread
{
public static void main(String[] args) 
{
A a1=new A();
a1.start();
B12 b=new B12();
b.start();
}
}
