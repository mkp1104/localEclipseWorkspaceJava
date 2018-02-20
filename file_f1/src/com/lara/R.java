package com.lara;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class R
{
	public static void main(String[] args) throws IOException 
	{
		FileWriter out=new FileWriter("test1.txt");
		out.write("hello to all");
		out.write("\nhello to all");
		out.flush();//giving the permision to garbagecollect to clean!!! while cleannig used object..
		out.close();
		System.out.println("done");
	}
}