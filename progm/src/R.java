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
	
	
	R.test();
	
	}
}