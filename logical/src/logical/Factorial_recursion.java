package logical;
import java.util.*;
public class Factorial_recursion 
{
//	public static int  fact(int x)
//{
//return x;	
//}
	 static int factorial(int n){      
         if (n == 1)      
           return 1;      
         else      
           return(n * factorial(n-1));      
   }   
public static void main(String[] args) 
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Number");
int num=sc.nextInt();
//int factorial=1;
//for(int i=num;i>0;i--)
//{
//factorial=factorial*fact(i);	
//}
System.out.println("The Factorial of "+num+" : "+factorial(num));
}
}
