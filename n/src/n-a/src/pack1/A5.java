package pack1;
import java.util.Scanner;
import java.lang.Throwable;
class A5
{
	static int test(int s2)
		{
		if(s2==12)
		{
		System.out.println("you entered a Right no");
		//return s2;
		}
		else
		{
		
			System.out.println("You entered a Wrong No!!!! Please enter 12");
		return 12;
		}	
		System.out.println(3);
			return 23;
		}
		
	public static void main(String[] args) 
	{
		System.out.println("Started");
		System.out.println("Enter");
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		try{
		int s2=Integer.parseInt(s1);
		test(s2);
		}
		catch(NumberFormatException ex)
		{
			System.out.println(ex);
		}
		}

	}

