package mb.app5.src;
class B 
{
	public static void test(int i)
	{
	System.out.println("From test");
	System.out.println(i);
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test(10);
		System.out.println("-----");
		int k=100;
		test(k);
	System.out.println("main end");
		
	}
}
