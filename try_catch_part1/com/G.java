package com.lara;
public class G
{
	public static void main(String args[])
	{
	System.out.println(1);
	main(args);//now in this program for every exception jvm reserve som m/m space for printing the exception ,type of exception and line of exception,so every exceptio there will be seperate m/m space so..o/p will be 1111....exc,exp,exp,exp..... up to m/m provided for main prgrm by O.S!!!!
	System.out.println(2);
	}
}
