package com.lara;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class B
{
	public static void main(String[] args) throws IOException 
	{
		FileReader o=new FileReader("text.txt");
		BufferedReader b=new BufferedReader(o);
		String s1=b.readLine();
		while(s1!=null)
		{
		System.out.println(s1);
		s1=b.readLine();
		}
		b.close();
		o.close();
		b=null;
		o=null;
		System.out.println("OK");
	}
}
