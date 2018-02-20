package com.lara;
import java.io.File;
import java.io.IOException;
public class N1
{
	public static void main(String[] args) throws IOException 
	{
		File f1=new File("E:/lab/a/b/c/d/e/f.txt");
		System.out.println(f1.mkdirs());
	}
}