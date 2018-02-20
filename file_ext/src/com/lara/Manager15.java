package com.lara;
import java.io.PrintStream;

public class Manager15
 {
	public static void main(String[] args) throws Exception 
	{
		PrintStream p1=new PrintStream("test15.log");;
		System.out.println(100);
		System.setOut(p1);
		System.out.println(200);
		}
}
