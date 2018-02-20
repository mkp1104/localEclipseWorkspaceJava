class M
{
	int i;
	void test1()
	{
	System.out.println("from test1:"+i);
	i=10;

	}
	void test2()
	{
	System.out.println("from test2:"+i);
	i=20;
	}
	void test3()
	{
	System.out.println("from test3:"+i);
	i=40;
	test1();
	i=50;
	}
	void test4()
	{
	System.out.println("from test4:"+i);
	i=60;
	test2();
	i=70;
	}
	public static void main(String[] args) 
	{
		M m1=new M();
		System.out.println("main:"+m1.i);
		m1.test4();
		System.out.println("main2:"+m1.i);
	
		m1.test3();
System.out.println("main3:"+m1.i);
m1.test2();
System.out.println("main4:"+m1.i);
m1.test1();
System.out.println("main5:"+m1.i);
}
}
