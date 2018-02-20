package mb.app7.src;class J
{
	static int i=test();
		static {
	System.out.println("sib begin");
	main(null);
System.out.println("sib end");
			}
static int test()
	{
	System.out.println("test begin");
	main(null);
System.out.println("test end");
	return 20;
	}

	public static void main(String[] args) 
	{
		System.out.println("main"+i);
		
	}
}