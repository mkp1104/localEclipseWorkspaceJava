class W
{
	void test()
	{
		System.out.println("from U");
	}
	
}
class X extends W
{
	void test(int i)
	{
		System.out.println("from X");
	}
	public static void main(String args[])
	{
		X obj=new X();
		obj.test();
	
	}		
}