package logical;
import java.util.*;
public class Plingdrom_String 
{
public static void main(String[] args) 
{
System.out.println("Enter the String");	
Scanner sc=new Scanner(System.in);
String s=sc.next();
StringBuffer sb=new StringBuffer(s);
System.out.println("Reversed String is "+sb.reverse().toString());
}
}
