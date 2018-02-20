class Manager19
{
	static void test(B b1)
	{
		System.out.println("from test(B)");
	}
	public static void main(String[] args) 
	{

		A a1=new B();
		test((B)a1);
		System.out.println("Hello World!");
	}
}
