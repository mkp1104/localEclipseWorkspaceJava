package mb.app6.src;class H1 
{
	static int i;
	static int test()
	{
	System.out.println("from test:"+i);
	return ;
	}
	public static void main(String[] args) 
	{
		System.out.println("main:"+i);
		i=10;
		test();
	}
}
