package com.lara;
import java.io.PrintStream;

public class Manager152
 {
	public static void main(String[] args) throws Exception 
	{
		PrintStream p1=new PrintStream("test152.txt");;
		System.out.println(100);
		System.setOut(p1);
		System.out.println(200);
		}
}
