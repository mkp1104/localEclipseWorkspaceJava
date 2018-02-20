package mb.app4.src;

class F 
{
	public static void test1()
	{
	System.out.println("From test1");
	}
	public static void main(String[] args) 
	{
		System.out.println("from main");
		test1();
		System.out.println("-----");
		test1();
		System.out.println("-----");
		System.out.println("main end");
	}


}
