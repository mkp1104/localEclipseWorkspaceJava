class M
{
	void test()
	{
	System.out.println("from M");
	}
}
class N extends M
{
	protected void test()
	{
	
	System.out.println("from N");
	
	}
	public static void main(String args[])
	{
	
	N n1=new N();
	n1.test();
	System.out.println("done");
	}
}