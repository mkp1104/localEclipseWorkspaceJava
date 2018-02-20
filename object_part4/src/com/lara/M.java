package com.lara;
public class  M
{
@Override
protected void finalize() throws Throwable
{
System.out.println("from finalize");
}
	public static void main(String[] args) 
	{
		M m1=new M();//live object.
		m1=null;//making new M() dead.
		System.out.println("obj become aboundend");
		System.out.println(m1);
		//Runtime.getRuntime().gc();
		//Runtime.getRuntime().gc();
		//System.gc();
		//m1.finalize();
	
/*
		try
		{
			Thread.sleep(30*1000);
		}
		catch(InterruptedException ex)
		{
			ex.printStackTrace();
		}
		System.out.println("end");
	*/
}
}