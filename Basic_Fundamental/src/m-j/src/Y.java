class X
{
	void test()
	{
	System.out.println("from X");
	}
}
class Y extends X
{
	void test()
	{
	System.out.println("from Y");
	
	super.test();
	System.out.println("from Y");
	}
	public static void main(String []args)
	{
	Y y=new Y();
	y.test();
	}
}