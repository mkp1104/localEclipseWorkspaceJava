package mb.app4.src;

class U 
{
	public static int test()
	{
		System.out.println("from test");
		return 20;
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test();
		System.out.println("main end");
	}
}
