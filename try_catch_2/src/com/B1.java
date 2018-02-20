package com;
import java.util.Scanner;
class B1
{
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Started");
		System.out.println("Enter your name");
		String name=s1.next();
		System.out.println("Enter your age");
		int age=s1.nextInt();
		System.out.println("Enter your weight");
		double weight=s1.nextDouble();
		System.out.println("You Entered");
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Weight:"+weight);
	}
}