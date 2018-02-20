package logical;
import java.util.*;

public class D 
{
public static void main(String[] args) {
	

	System.out.println("enter the  Number upto fibonaci series");

		Scanner sc=new Scanner(System.in);
		
		int x=sc.nextInt();
		int index[]=new int[x];
		index[0]=0;
		index[1]=1;
		int j=0;
		int k=1;
		
		for (int i=2;i<x;i++)
		{
			index[i]=index[j]+index[k];
			j++;
			k++;
		}
		System.out.print("fibonaci series is :"+Arrays.toString(index)+",");
		
}
}
