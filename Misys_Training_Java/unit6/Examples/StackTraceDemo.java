class SomeClass
{
	public static void demo1()
	{
		System.out.println("Inside demo1()");
		demo2();
	}
	public static void demo2() throws Exception
	{
		throw new Exception();
	}
	public static void demo3()throws Exception
	{
		throw new Exception();
	}
}

public class StackTraceDemo 
{
	public static void main(String[] args) 
	{
		try
		{
			SomeClass.demo1();
			SomeClass.demo2();
			SomeClass.demo3();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
