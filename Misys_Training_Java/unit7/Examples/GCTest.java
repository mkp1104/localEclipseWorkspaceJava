public class GCTest
{
	void eatMemory()
	{
		int[] intArray = new int[50000];
		for (int i=0; i<50000; i++)
			intArray[i] = i; 
	}
	
	public static void main (String[] args)
	{
		GCTest gct = new GCTest();
		Runtime r = Runtime.getRuntime();
		long freeMem = r.freeMemory(); 
		System.out.println("free memory before creating array : " + freeMem);
		gct.eatMemory();
		freeMem = r.freeMemory();
		System.out.println("free memory after creating array : " + freeMem); 
		System.gc();
		freeMem = r.freeMemory();
		System.out.println("free memory after running gc() : " + freeMem); 
	} 
 } 
