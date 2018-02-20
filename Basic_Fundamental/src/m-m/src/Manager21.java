class C 
{
public	void test()
	{
	System.out.println("from C-test");
	}
}
class D extends C
{
public	void test()
	{
		System.out.println("from D-test");
	}
}
class Manager21
{

	public static void main(String[] args) 
	{

	C c1=new C();
	c1.test();
	  c1=new D();
	c1.test();			

	}
}