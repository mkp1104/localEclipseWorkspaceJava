class O1 
{
	public static void main(String[] args) 
	{
		int i=10;
		final int j=20;
		static class A
		{
			void test()
			{
			//System.out.println(i);
			System.out.println(j);
			}
		}
		System.out.println("done");
	}
}
