package logical.logical1;
import java.util.Iterator;
import java.util.Scanner;
import java.util.LinkedList;
public class Prime_Factor 
{
public static void main(String[] args) 
{
	int count=0;
	LinkedList list=new LinkedList();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the  Number");
	int x=sc.nextInt();
	for(int j=2;j<=x;j++)
	{
	while(x%j==0)
	{
			list.add(j);
			list.add("*");
		x=x/j;
	}
	
	}
	list.removeLast();
	Iterator it=list.iterator();
	
	
	while(it.hasNext())
	{
		System.out.print(it.next());
	}
	
}
}
