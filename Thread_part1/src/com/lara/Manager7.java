package com.lara;
class E implements Runnable
{
//	public String v;
	@Override
	public void run()
	{
	for(int i=0;i<10;i++)
		{
//			System.out.println(v);
			System.out.println(i);
		}
	}

}  
public class Manager7
{


	public static void main(String[] args) 
	{

		E e1=new E();
//		e1.v = "gfh";
		Thread t1=new Thread(e1);
//		t1.setDaemon(true);
		
		t1.start();
//		Thread t2=new Thread(e1);
//		t2.start();
		
//		e1.run();
		
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i=10;i<20;i++)
		{
		System.out.println(i);
		}
	}
}