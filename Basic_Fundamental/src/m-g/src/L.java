interface H
{
	void test1();
}
interface I
{
	void test2();
}
interface J
{
	void test3();
}

abstract class  K implements H,I,J
{
	public void test2()
	{
	System.out.println("From test2");
	}
}
class L extends K
{

	public void test1()
	{
		System.out.println("From test1");
	}
	
	public void test3()
	{
		System.out.println("From test3");
	}
	public static void main(String[] args) 
	{
		L g1=new L();
		g1.test1();
		g1.test2();
		g1.test3();
		System.out.println("done");
	}
}
