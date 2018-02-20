package mb.app5.src;
class F 
{
	public static void test(int i)
	{
	System.out.println("test:"+i);
	i=10;
	}
	public static void main(String[] args) 
	{
		int i=20;
		System.out.println("main begin"+i);
		test(i);
		System.out.println("main end"+i);
	}
}
