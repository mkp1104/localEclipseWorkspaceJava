package logical.logical1;
import java.util.Scanner;
public class Factorial 
{
public static void main(String[] args) 
{
Scanner sc=new Scanner(System.in);	
System.out.println("Enter The Number");
int x=sc.nextInt();
int fact=x;
while(x>1)
/*{
fact=fact*(x-1);
x=x-1;
}*/
{
fact=fact*(--x);	
}
System.out.println("Factorial Of The Number is "+fact);
}
}
