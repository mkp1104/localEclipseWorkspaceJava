package com.lara;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class T
{
	public static void main(String[] args) throws IOException 
	{
		FileReader in=new FileReader("test.txt");
		char[] x=new char[5];
		in.read(x);
		String s1=new String(x);
		System.out.println(s1);
	}
}