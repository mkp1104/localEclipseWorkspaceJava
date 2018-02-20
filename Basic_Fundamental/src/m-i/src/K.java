class K
{
	private static void test()//not depends on access level it can protected also
	{
		System.out.println("from test");
	}
	protected int test()//not depends on access level private also,depends on signature of test m()
	{
		System.out.println("from test again");
		return 10;
	}
}