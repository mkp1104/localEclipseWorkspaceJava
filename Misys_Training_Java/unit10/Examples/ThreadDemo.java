class SimpleThread extends Thread {
	private int countDown = 5;
	private static int trdCount = 0;
	private int trdNum = ++trdCount;
	
	SimpleThread() {
	      System.out.println("Making thread " + trdNum);
	}

	public void run() {
	    while(true) 
		{
	          System.out.println("Thread" + trdNum + "(" + countDown+")");
		   if(--countDown == 0) return;
	    }
	}
}

class ThreadDemo
{
     public static void 	main(String[] s)
     {
		 for(int i=1;i<=5;i++)
			new SimpleThread().start();
      }
}
