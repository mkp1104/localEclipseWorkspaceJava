package logical.logical1;
import java.util.Scanner;
public class Scanner_Fault 
{
public static void main(String[] args) 
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter y/n");
String decider =null;
do
{
decider=sc.next();	
}while(decider.equals("y"));
}
}
