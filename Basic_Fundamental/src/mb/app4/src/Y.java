package mb.app4.src;

class Y 
{
	public static int test1()
	{
		System.out.println("from test1");
		return 100;
	}
	public static int test2()
	{
		System.out.println("from test2");
		return test1();
	}

	public static void main(String[] args) 
	{
		test1();
		System.out.println(test2());
		System.out.println(test2()+test1());
		test2();
	}
}
