class H 
{
	static void test()
	{
	System.out.println("from H-test");
	}
}
class I extends H
{
	static void test()
	{
	System.out.println("from I-test");
	}
/*	static 
		{
	System.out.println("from SIB-I-test");
		}
*/}
class Manager4
{

	public static void main(String[] args) 
	{
	H h1=new H();
	I i1=new I();
	H[] x=new H[2];
	x[0]=h1;
	x[1]=i1;
for (int i=0;i<x.length ;i++ )
{
	x[i].test();
}
//i1.test();
//h1.test();
}
}
