package com.lara;
import java.io.FileWriter;
import java.io.File;
import java.io.BufferedWriter;
import java.io.IOException;

public class A1
{
	public static void main(String[] args) throws IOException 
	{
		File f=new File("test.txt");
	//	BufferedWriter f2=new BufferedWriter(f);
		FileWriter o=new FileWriter("text.txt");
//		BufferedWriter b=new BufferedWriter("test.txt");
		BufferedWriter b=new BufferedWriter(o);
		b.write("Hello to all");
		b.newLine();
		b.write("Hello to all Again");
		b.newLine();
		b.write("Hello to all Once More");
		b.flush();
		b.close();
		b=null;
		System.out.println("done");
	}
}
