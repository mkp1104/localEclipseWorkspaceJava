package com.pratian;

import com.pratian.resources.*;

public class AssertionDemo 
{
	public static void client()
	{
		Printer p = Printer.getPrinter();
		assert p!=null : "printer is null" ;
		p.print("Testing assertions");
	}

	public static void main(String[] args) 
	{
		client();
		int i = 100;

	}
}
