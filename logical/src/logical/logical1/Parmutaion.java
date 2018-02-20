package logical.logical1;
import java.util.Arrays;
public class Parmutaion 
{
	public static void swap(int []x,int i,int j)
	{
		int temp=x[i];
		x[i]=x[j];
		x[j]=temp;
		
		
	}
	public static void main(String[] args) {
	

int x[]=new int[3];
x[0]=1;
x[1]=2;
x[2]=3;
System.out.println("Total number of Permutation for 123 is ");
System.out.println(Factorial_call.fact(x.length));
for (int i : x) {
	System.out.print(i);
}
System.out.println();
swap(x,1,2);
for (int i : x) {
	System.out.print(i);
}
System.out.println();
swap(x,0,1);
for (int i : x) {
	System.out.print(i);
}
System.out.println();
swap(x,1,2);
for (int i : x) {
	System.out.print(i);
}
System.out.println();
swap(x,0,1);
for (int i : x) {
	System.out.print(i);
}
System.out.println();
swap(x,1,2);
for (int i : x) {
	System.out.print(i);
}
System.out.println();
	}
}
