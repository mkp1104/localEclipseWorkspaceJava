interface R
{
	void test1();
	
} 
interface S
{
	void test2();
}
interface T extends S,R
{
	void test3();
} 
interface U
{
	void test4();
}
class V
{
	void test5()
	{
	System.out.println("from test5");
	}
}
class W extends V implements T,U
{
	public void test1()
	{
	System.out.println("from test1");
	}
	public void test2()
	{
	System.out.println("from test2");
	}
	public void test3()
	{
System.out.println("from test3");
	}
	
	public void test4()
	{
System.out.println("from test4");
	}
	public static void main(String[] args) 
	{
		W q1=new W();
		q1.test1();
		q1.test2();
		q1.test3();
		q1.test4();
		q1.test5();
		System.out.println("done");
	}
}