package com.lara;
import java.util.Arrays;
 class C
{
	int i;
	C(int i)
	{
	this.i=i;
	}
	public String toString()
	{
	return "i="+i;
	}
}  
public class Manager3
{
	public static void main(String[] args) 
	{
		Manager3[] m=new Manager3[2];
		int y[]=new int[2];
		String s[]=new String[3];
		C[]x=new C[4];
		x[0]=new C(9);
		x[1]=new C(5);
		x[2]=new C(7);
		x[3]=new C(4);
		System.out.println("m:"+m);
		System.out.println("y:"+y);
		System.out.println("x:"+x);
		System.out.println("s:"+s);
		System.out.println(Arrays.toString(m));
		System.out.println(Arrays.toString(y));
		System.out.println(Arrays.toString(x));
		System.out.println(Arrays.toString(s));
	//	Arrays.sort(x);//unable to sort because sort method short only on the value not on the Address of the value .
	//	System.out.println(Arrays.toString(x));
	}
}
