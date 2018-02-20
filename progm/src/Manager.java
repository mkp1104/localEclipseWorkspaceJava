class P
{
 static void test()
{
System.out.println("test-P");	
}
}
class R extends P
{
static void test()
{
System.out.println("test-R");	
}
}
public class Manager{
public static void main(String args[])
	{
	P p=new P();
	R r=new R();
	//r.test();
   //p.test();
	R[] x=new R[2];
	for (int i = 0; i < x.length; i++) {
		x[i].test();
	}
	
	}
}