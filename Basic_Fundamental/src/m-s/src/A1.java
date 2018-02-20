class A1 
{
	int i;
	static int j;
	void test1()
	{
	i=20;//this.i=20
	j=30;//this.j=30;
	test1();//this.test1();
	test2();//this.test2();
	}
	static void test2()
	{
	//i=20;
	j=30;
	//test1();
	test2();
	}
}
