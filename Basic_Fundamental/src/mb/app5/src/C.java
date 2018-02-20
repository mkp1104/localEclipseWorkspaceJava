package mb.app5.src;
class C 
{
	public static void test(int i)
	{
	System.out.println("from test");
	System.out.println(i);
	}
	public static void main(String[] args) 
	{
		System.out.println("from main");
		test(100);
		int k=200;
		test(k);
		test(k+300);
		int m;
		test(m);
		System.out.println("done");
	}
}
