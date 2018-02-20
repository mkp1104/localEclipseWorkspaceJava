package logical.logical1;
import java.util.Scanner;

public class ArmstrongNumber 
{
public static void main(String[] args) 
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter The nUmber");
int i=sc.nextInt();
int y=i;
int rem=0;
int sum=0;
while(i>0)
{
rem=i%10;
sum=sum+(rem*rem*rem);
i=i/10;
}
if(sum==y)
{
System.out.println("Its a Armstrong Number");	
}
else
{
System.out.println("Its not a Armstrong Number");	
}
sc.close();
}
}
