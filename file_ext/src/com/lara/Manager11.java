package com.lara;
import java.io.Console;

public class Manager11
 {
	public static void main(String[] args) 
	{
		Console c1=System.console();
		System.out.println("enter something!!!");
		char x[]=c1.readPassword();
		System.out.println("you entered...");
		String s1=new String(x);
		System.out.println(s1);
		}
}
