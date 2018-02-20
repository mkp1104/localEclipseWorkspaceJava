interface A
{
	void test1();
}
interface B
{
	void test2();
}

class  C implements A,B
{
	public void test1()
	{
	System.out.println("From test1");
	}
	public void test2()
	{
		System.out.println("From test2");
	}
	public static void main(String[] args) 
	{
		C c=new C();
		c.test1();
		c.test2();
		System.out.println("done");
	}
}
