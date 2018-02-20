interface U
{
 void test1();
 int test2(int i);
double test3(boolean b);
}
abstract class V implements U
{
	public  void test2(int i)
	{
	System.out.println("from test2");
	}
	abstract void test4();
}
abstract class W extends V
{
	
		void test4()
	{
		System.out.println("from test4");	
	}
	public double test3(boolean b)
	{
		System.out.println("from test3");
		return 29.89;
	}

	public void  test1()
	{
	System.out.println("from test1");
	}
	
}
class X extends W
{

	public static void main(String []args)
	{
		X obj=new X();
		obj.test1();
		obj.test2(20);
		obj.test4();
		
		System.out.println(obj.test3(true));
	}
}