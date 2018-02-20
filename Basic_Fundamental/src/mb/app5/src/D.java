package mb.app5.src;
class D 
{
	public static void test(int i)
	{
	System.out.println("from test:" + i);
	
	}
	public static void main(String[] args) 
	{
		System.out.println("from main begin");
		int m;
		test(m=10);
	System.out.println("done");
	}
}
