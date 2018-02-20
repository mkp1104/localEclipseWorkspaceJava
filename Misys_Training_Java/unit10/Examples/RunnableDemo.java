class NewThread implements Runnable
{
	int start,stop;
	
	NewThread(int start,int stop) 
	{
		this.start=start;
		this.stop=stop;
	}
	public void run()
	{  
	      for(int i=stop;i>start;i--)
		System.out.println(Thread.currentThread() + " : " + i);
	      System.out.println("Exiting " + Thread.currentThread());
	}
}

class RunnableDemo 
{
	public static void main(String args[])
	{
		NewThread nt1=new NewThread(5,10); 
		NewThread nt2=new NewThread(15,18); 
		Thread t1 = new Thread(nt1);
		Thread t2 = new Thread(nt2);
		System.out.println("Starting Thread 1 ");
		t1.start();
		System.out.println("Starting Thread 2 ");
		t2.start();
		System.out.println("Main thread exiting");
	}  
}
