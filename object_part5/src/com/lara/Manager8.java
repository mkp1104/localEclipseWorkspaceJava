package com.lara;
public class Manager8 
{
/*	protected void finalize() throws Throwable
	{
		System.out.println("Finalize()");
		
	}
	*/
	public static void main(String[] args) throws Throwable 
	{
		Manager8 m1=new Manager8();
		m1.finalize();
	//	System.out.println(m1);
		m1.finalize();
		m1.finalize();
		m1.finalize();
		System.gc();
	//	Runtime.getRuntime().gc();
	}
}
