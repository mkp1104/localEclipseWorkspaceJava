abstract class F1
{
abstract void test1();
static void test2()
	{
System.out.println("from test2");
}
}
class G1 extends F1
{

	void test1()
	{
	System.out.println("from test1");
	}
	public static void main(String[] args)
	{
//	F1 f1=new F1();
//	F1 f1;// you can create reffernce variable
	G1 g1=new G1();

//	f1.test1();
	F1.test2();
	g1.test1();
	g1.test2();
	System.out.println("done");
	}
}
