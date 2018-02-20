package logical;
import java.util.*;
public class Factorial 
{
public static void main(String[] args) 
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter  The Number");
int x=sc.nextInt();
int fact=1;
for(int i=x;i>0;i--)
{
fact=fact*i;
}
System.out.println("Factorial of "+x+" is "+fact);
}
}
