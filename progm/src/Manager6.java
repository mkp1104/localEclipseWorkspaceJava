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
public class Manager6
{
public static void main(String args[])
	{
	
	
	R.test();
	
	}
}