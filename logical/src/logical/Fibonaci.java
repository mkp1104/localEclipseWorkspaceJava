package logical;
import java.util.*;
public class Fibonaci 
{
public static void main(String[] args) 
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter A Number");
int x=sc.nextInt();
int y=x;
int num=0;
int rem=0;
while(x>0)
{
num=x%10;
rem=rem+(num*num*num);
x=x/10;
}
if(rem==y)
{
System.out.println("Its A Armstrong Number");	
}
else
{
System.out.println("Its is Not A Armstrong Number");	
}
}
}
