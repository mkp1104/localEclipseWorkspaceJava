class L
{
	int i;
	void test1()
	{
	
	i=10;
	test2();
	}
	void test2()
	{
	System.out.println("test2:"+i);
	i=20;
	}
	public static void main(String[] args) 
	{
		L k1=new L();
		System.out.println("main:"+k1.i);
		k1.test1();
		System.out.println("main2:"+k1.i);
		k1.i=30;
		k1.test2();
System.out.println("main3:"+k1.i);
}
}
