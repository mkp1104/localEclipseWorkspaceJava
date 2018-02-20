package com.lara;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class A
{
	public static void main(String[] args) throws IOException 
	{
		FileWriter o=new FileWriter("text.txt");
	//	o.write("hello");
		BufferedWriter b=new BufferedWriter(o);
		b.write("Hello to all");
		b.newLine();
		b.write("Hello to all Again");
		b.newLine();
		b.write("Hello to all Once More");
	//	b.flush();//After this Statement content will be written in text.txt file!!!flush()is mandatory
	//	b.close();//here flush() is done automatically!!! no need of flush()!!! 
		b=null;
		System.out.println("done");
	}
}