package logical.logical1;
import java.util.Scanner;
public class Palingdrome 
{
public static void main(String[] args) 
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Number");
int i=sc.nextInt();
int y=i;
int rem=0;
int num=0;
while(i>0)
{
rem=i%10;
num=10*num+rem;
i=i/10;
}
if(y==num)
{
System.out.println("It is a Palindrome number");
}
else
{
System.out.println("It is not a Palyndrome number");	
}
}
}
