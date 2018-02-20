package com.lara;
class E1 extends Thread
{
}
public class Manager5
{
	public static void main(String[] args) 
	{
//		Thread e1=new Thread();
		E1 e1=new E1();
		e1.setName("first Thread");
		
		e1.start();
		//e1.setName("first Thread"); //No Problem It can be here  Also.
	
		E1 e2=new E1();
		e2.setName("second Thread");
		e2.start();
		System.out.println(e1.getId());
		System.out.println(e1.getName());
		System.out.println(e1.getPriority());
		System.out.println(e1.isDaemon());
		System.out.println("----");
		System.out.println(e2.getId());
		System.out.println(e2.getName());
		System.out.println(e2.getPriority());
		System.out.println(e2.isDaemon());
	
	}
}
