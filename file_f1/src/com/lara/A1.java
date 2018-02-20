package com.lara;
import java.io.File;
import java.io.IOException;
public class A1
{
	public static void main(String[] args) throws IOException 
	{
		File f1=new File("");
		boolean b1=f1.createNewFile();
		System.out.println(b1);
		System.out.println("done");
	}
}
