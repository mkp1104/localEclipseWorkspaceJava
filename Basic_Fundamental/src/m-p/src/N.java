class N 
{
	void test1()
	{
	System.out.println("from test1");
	test2();
	}
	void test2()
	{
	System.out.println("from test2");
	test3();
	}
	void test3()
	{
	System.out.println("from test3");
	}
	public static void main(String[] args) 
	{
		N n1=new N();
		n1.test1();
		System.out.println("-----");
		n1.test2();
		System.out.println("-----");
		n1.test3();
		System.out.println("-----");
	}
}
