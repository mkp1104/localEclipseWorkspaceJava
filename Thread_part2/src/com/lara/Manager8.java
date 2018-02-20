package com.lara;
public class Manager8
{
	public static void main(String[] args) 
	{
		
	class A extends Thread 
	{

	}
	class B extends Thread
	{
	}
		System.out.println("----");
		Thread t2=Thread.currentThread();
		System.out.println(t2.getName());
		
		A a1=new A();// A Thread is Created...
//		a1.start();
		System.out.println(a1.getPriority());
		System.out.println(a1.getName());
		Thread t1=Thread.currentThread();
		System.out.println(t1.getName());
		
		t1.setPriority(Thread.MAX_PRIORITY);

		A a2=new A();//1 more Thread is Created....
		A a3=new A();//again 1 more Thread is Created...
		B b1=new B();// again and again 1 more Thread is Created....

		System.out.println(a2.getPriority());
		System.out.println(a2.getName());
		System.out.println(a3.getPriority());
		System.out.println(a3.getName());
		System.out.println(b1.getPriority());
		System.out.println(b1.getName());
		
	}
}
