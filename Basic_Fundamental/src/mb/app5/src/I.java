package mb.app5.src;
class I 
{
	public static void test(boolean flag,int x)
	{
	System.out.println("from test");
	System.out.println(flag);
	System.out.println(x);
	}
	public static void main(String[] args) 
	{
	
		System.out.println("from main");
		test(true,20);
		System.out.println("-----");
		boolean f1=false;
		test(f1,30);
	}
}
