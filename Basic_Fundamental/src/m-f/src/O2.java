class M 
{
}
class N
{
	static void test()
	{
	System.out.println("N-test()");
	}
}
class O2 extends N
{
	public static void main(String args[])
	{
	N.test();
	}
}
