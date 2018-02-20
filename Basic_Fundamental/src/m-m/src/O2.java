class N1 
{
	public static void main(String[] args) 
	{
		System.out.println("main-N");
	}
	static
	{
	System.out.println("SIB-N1");
	}
}
class O1 extends N1
{
	static 
	{
	System.out.println("SIB-O1");
	}
}
class O2 
{
		static
			{
					System.out.println("SIB-O2");
			}


	public static void main(String args[])
	{
	System.out.println("MAIN-O2");
	O1.main(args);
	}
}