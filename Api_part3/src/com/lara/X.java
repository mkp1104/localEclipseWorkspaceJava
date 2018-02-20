package com.lara;
import java.util.Arrays;
public class X
{
	public static void main(String[] args) 
	{
		int[] x={10,2,30,15,13,20};
		System.out.println(Arrays.toString(x));
		Arrays.sort(x);
		System.out.println(Arrays.toString(x));
		int i=Arrays.binarySearch(x,21);//check tke output
		System.out.println(i);
		i=Arrays.binarySearch(x,3);//check the output
		System.out.println(i);
		i=Arrays.binarySearch(x,11);
		System.out.println(i);
		i=Arrays.binarySearch(x,24);
		System.out.println(i);


		}
}
