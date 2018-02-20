abstract class X
{
	X(int i)
	{
	System.out.println("X(int)");
	}
abstract void test1();
}
abstract class Y extends X
{
Y()
	{
		super(90);
		System.out.println("Y()");
	}
}
class Z extends Y
{
	Z()
	{
	System.out.println("Z()");
	}
	void test1()
	{
	System.out.println("from test1");
	}
	public static void main(String []args)
	{
	Z z=new Z();
	System.out.println("----");
	z.test1();
	}
}