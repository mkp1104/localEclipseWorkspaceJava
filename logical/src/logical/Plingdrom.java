package logical;
import java.util.*;
public class Plingdrom 
{
public static void main(String[] args) 
{
System.out.println("Enter the Number");	
Scanner sc=new Scanner(System.in);
int x=sc.nextInt();
int y=x;
int num=0;
int rem=0;
while(x>0)
{
num=x%10;
rem=rem*10+num;
x=x/10;
}	
if(y==rem)
{
System.out.println("Its A Palindrome!");	
}
else
{
System.out.println("Its not A Palindrom");	
}
}
}
