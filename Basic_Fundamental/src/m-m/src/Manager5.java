class J 
{
	static void test()
	{
	System.out.println("from J");
	}
	static 
	{
	System.out.println("SIB-J");
	}
}
class K extends J
{
 static 
	{
		System.out.println("SIB-K");
	}
}
class Manager5
{

	public static void main(String[] args) 
	{
		K.test();//J.test();
	}
}
