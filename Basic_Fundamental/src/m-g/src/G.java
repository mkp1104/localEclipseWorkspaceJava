interface D
{
	void test1();
}
interface E
{
	void test2();
}
interface F
{
	void test3();
}

class  G implements D,E,F
{
	public void test1()
	{
	System.out.println("From test1");
	}
	public void test2()
	{
		System.out.println("From test2");
	}
	
	public void test3()
	{
		System.out.println("From test3");
	}
	public static void main(String[] args) 
	{
		G g1=new G();
		g1.test1();
		g1.test2();
		g1.test3();
		System.out.println("done");
	}
}
