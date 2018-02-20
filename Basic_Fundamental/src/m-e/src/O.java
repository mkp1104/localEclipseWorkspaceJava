abstract class N
{
void test1()
	{
		System.out.println("from test1");
	}
	static 
	{
	System.out.println("SIB-N");
	}
}
class O extends N
{
	public static void main(String x[])
	{
	//  N n1=new N();
//    n1.test1();
N n1;
//n1.test1();
			System.out.println("----");
			O o1=new O();
			o1.test1();
			System.out.println("----");
//			System.out.println(n1);
	}

}