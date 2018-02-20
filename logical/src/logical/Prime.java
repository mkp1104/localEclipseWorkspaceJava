package logical;
import java.util.*;
public class Prime 
{
public static void main(String[] args) 

{
	
	System.out.println(" Prime Numbers up to ..");
	Scanner sc=new Scanner(System.in);
	int x=sc.nextInt();
	for(int i=2;i<x;i++)
	{
		
		for(int k=2;k<i;k++)
		{
			if(i%k==0)
			{
				break;
			}
			System.out.print(i+",");
		}
	}
}
}
