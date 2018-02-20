package logical.logical1;
import java.util.Scanner;
public class factorial_recursion 
{
	public static int fact(int i)
	{
		return (i-1);
		
	}
public static void main(String[] args) 
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the  Number");
int i=sc.nextInt();
int factorial=i;
while(i>1)
	{
	factorial=factorial*fact(i);
	i=(i-1);
	}
System.out.println("The Factorial is "+factorial);
}
}
