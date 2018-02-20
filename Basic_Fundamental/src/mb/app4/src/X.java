package mb.app4.src;

class X 
{
	public static int test()
	{
		int i=10;
		return i;
	}
	public static void main(String[] args) 
	{
		test();
		System.out.println(test());
		System.out.println(test()+test());
	}
}
