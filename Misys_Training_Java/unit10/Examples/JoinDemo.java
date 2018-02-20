class JoinThreads extends Thread
{
  double e;

  public void run ()
  {
   for (int i = 0; i < 20; i++)
      e += 1.0 / factorial (i);

   System.out.println ("Done");
  }

  int factorial (int n)
  {
   if (n == 0)
     return 1;
   else
     return n * factorial (n - 1);
  }
}

class JoinDemo
{
	public static void main (String [] args)
	{
	   JoinThreads jd = new JoinThreads();
	   jd.start ();

	   try
	   {
		 jd.join ();
	   }
	   catch (InterruptedException e)
	   {
	   }

	   System.out.println ("e = " + jd.e);
  }
}

  