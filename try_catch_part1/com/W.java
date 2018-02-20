package pack1;
import java.util.Scanner;
public class W
{
	public static void main(String[] args) 
	{
		//int i=10/0; 
	//		System.out.println("Main-Block");
		if(true)
		{
	//			System.out.println("IF-Block");
		return;
		}
		try
		{
			System.out.println(1);
			return;
		}
		catch (ArithmeticException ex)
		{
			System.out.println(2);
		}
		finally
		{
		System.out.println(3);
		System.out.println(3);
		}
		System.out.println(4);
	}
}