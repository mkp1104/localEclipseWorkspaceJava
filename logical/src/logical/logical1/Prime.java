package logical.logical1;
import java.util.Scanner;
public class Prime 
{
public static void main(String[] args) 
{


boolean  flag;

Scanner sc=new Scanner(System.in);
String decider=null;

do{
	
System.out.println("Enter The Number(Greater than 1)");
int x=sc.nextInt();
flag=true;
if(x>1)
{
for(int i=2;i<x;i++)
{
if(x%i==0)
{
System.out.println("It is not A Prime Number");
flag=false;
break;
}
}
if(flag)
{
System.out.println("It is A Prime Number");	
}
}
else
{
System.out.println("Please Enter A Number Greater than 1");	
}
System.out.println("Want to Continue y/n");
decider=sc.next();
}while(decider.equals("y"));
}
}
