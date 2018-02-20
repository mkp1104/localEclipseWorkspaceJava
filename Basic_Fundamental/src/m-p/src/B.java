class B 
{
	static int i;
	B()
	{
	i=10;
	}
	{
	i=20;
	}
	static 
	{
	i=30;
	
	}
	void test()
	{
	i=40;
	}
	public static void main(String[] args) 
	{
		System.out.println(i);
		i=50;
		System.out.println(i);
	}
}
