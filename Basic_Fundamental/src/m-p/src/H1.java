class H1
{
	void test()
	{
	System.out.println("test:"+h1);//this=h1
	}
	public static void main(String args[])
	{
	
	H1 h1=new H1();
System.out.println("main:"+h1);
h1.test();
	}
}
