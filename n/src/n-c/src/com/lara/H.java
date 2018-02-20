package com.lara;
import java.util.Scanner;
public class H
{
	public static void main(String[] args) throws ClassNotFoundException 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(1);
		System.out.println("enter age");
		int age=sc.nextInt();//try with sc.next();
		if(age<=0)
		{
		throw new ArithmeticException("Age should be +ve No.");
		}
		System.out.println(2);
	}
}
