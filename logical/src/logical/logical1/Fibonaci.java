package logical.logical1;
import java.util.Scanner;
import java.util.LinkedList;
public class Fibonaci 
{
public static void main(String[] args) 
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the  Number");
int i=sc.nextInt();

LinkedList ls=new LinkedList();

ls.set(0, 0);
ls.set(1, 1);

for(int y=1;y<=i;y++)
{
	System.out.print(x[y+1]+",");
}
}
}