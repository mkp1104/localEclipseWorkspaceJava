package com.pratian.resources;

public class Printer 
{
	private static Printer printer;
	
	public static Printer getPrinter()
	{
		if(printer != null)
			printer =  new Printer();
		return printer; 
	}
	public void print(String str)
	{
		System.out.println(str);
	}
}
