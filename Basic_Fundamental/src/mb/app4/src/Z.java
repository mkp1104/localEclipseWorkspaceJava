package mb.app4.src;

class Z 
{
	public static int test1()
	{
		System.out.println("form test1");
		return 10;
	}
	public static int test2()
	{
		System.out.println("From test2");
		return test1();
	}
	public static int test3()
	{
	System.out.println("from test3");
		return test1()+test2(); 
	}
	public static void main(String[] args) 
	{
		System.out.println(test1());
		System.out.println(test2());
		System.out.println(test3());
	}
}
