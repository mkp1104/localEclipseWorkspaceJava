import java.util.Scanner;
public class T
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter something...");
		String s1=sc.next();
		try
		{
			System.out.println(1);
			int i=Integer.parseInt(s1);
			System.out.println(2);
			int k=i/(i-9);
			System.out.println(3);
		}
	//	System.out.println(3); CTE
		catch (ArithmeticException ex)
		{
			System.out.println(4);
			System.out.println(ex);
			System.out.println(5);
		}
		//System.out.println(3); CTE
		finally
		{
		System.out.println("Finally");
		}
		System.out.println(6);
		int z=23;
	//	test(); OK
		}
// static void test() OK
	{}
}