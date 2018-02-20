package com.lara;
import java.io.PrintStream;

public class Manager16
 {
	public static void main(String[] args) throws Exception 
	{
		PrintStream p1=System.out;
		PrintStream p2=new PrintStream("test16.log");;
		System.out.println(1);
		p1.println(2);
		p2.println(3);
		System.setOut(p2);
		System.out.println(4);
		p1.println(5);
		p2.println(6);
		System.setOut(p1);
		System.out.println(7);
		p1.println(8);
		p2.println(9);
		}
}
