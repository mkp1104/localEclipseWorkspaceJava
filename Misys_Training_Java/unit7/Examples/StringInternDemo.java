public class StringInternDemo 
{
	public static void main(String[] args)
	{
		long startTime1 = System.currentTimeMillis();
		for(int i=0;i<50000;i++)
		{
			String s1 = "hello";
			String s2 = "hello";
		}
		long endTime1 = System.currentTimeMillis();
		System.out.println("Time taken for creation of String literals : " + (endTime1 - startTime1) + " milli seconds" );
		
		long startTime2 = System.currentTimeMillis();
		for(int i=0;i<50000;i++)
		{
			String s3 = new String("hello");
			String s4 = new String("hello");
		}
		long endTime2 = System.currentTimeMillis();
		System.out.println("Time taken for creation of String objects : " + (endTime2 - startTime2)+" milli seconds");
	}
}