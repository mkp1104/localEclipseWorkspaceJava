class SleepDemo extends Thread 
{
	public void run()
	{
		for(int i = 0 ; i < 10 ; ++i)
		{
			try
			{
				System.out.println(Thread.currentThread() + " sleeping ");
				Thread.sleep(700);
				System.out.println(Thread.currentThread() +" : " + i);
			}
			catch (InterruptedException ie)
			{
				ie.printStackTrace();
			}
		}
	}

	public static void main(String[] args) 
	{
		new SleepDemo().start();
		new SleepDemo().start();
	}
}
