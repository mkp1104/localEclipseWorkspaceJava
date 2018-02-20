package mb.app4.src;

class M 
{
	public static void test()
	{
	System.out.println("test begin");
	if(true)
		{
			System.out.println("From if");
			return;
		}
			System.out.println("test end");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test();
		System.out.println("main end");
	}
}
