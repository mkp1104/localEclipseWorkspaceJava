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
		int i=Arrays.binarySearch(x,4);
		System.out.println("0:"+i);
		System.out.println("4:"+i);
		i=Arrays.binarySearch(x,13);
		System.out.println("13:"+i);
		i=Arrays.binarySearch(x,11);
		System.out.println("11"+i);
		i=Arrays.binarySearch(x,24);
		System.out.println("24"+i);


		}
}
