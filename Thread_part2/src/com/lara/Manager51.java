package com.lara;
class E implements Runnable
{
/*	public  void run()
	{
	 
	}*/
}
public class Manager51
{
	public static void main(String[] args) 
	{
		E e1=new E();
		Thread t1=new Thread(e1);
		t1.setName("first Thread");
		t1.start();
	//	E e2=new E();
	//	e2.setName("second Thread");
	//	e2.start();
		System.out.println(t1.getId());
		System.out.println(t1.getName());
		System.out.println(t1.getPriority());
		System.out.println(t1.isDaemon());
	//	System.out.println("----");
	//	System.out.println(e2.getId());
	//	System.out.println(e2.getName());
	//	System.out.println(e2.getPriority());
	//	System.out.println(e2.isDaemon());
	
	}
}
