interface N
{
	void test1();
	
} 
interface O
{
	void test2();
}
interface P extends N,O
{
	void test3();
} 
class Q implements P
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
	
	}
	public static void main(String[] args) 
	{
		Q obj=new Q();
		obj.test1();
		obj.test2();
		System.out.println("done");
	}
}