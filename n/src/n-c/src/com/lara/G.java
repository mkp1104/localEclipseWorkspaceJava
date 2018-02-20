package com.lara;
import java.util.Scanner;//it is in the different package so....
public class G
{
	public static void main(String[] args) throws ClassNotFoundException 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(1);
		System.out.println("enter age");
	//	String age=sc.next();//try with sc.next();
		int  age=sc.nextInt();//try with sc.next();
		if(age<=0)
		{
		throw new ArithmeticException();
		}
		System.out.println(2);
	}
}
