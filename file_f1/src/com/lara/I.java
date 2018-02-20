package com.lara;
import java.io.File;
import java.io.IOException;
public class I
{
	public static void main(String[] args) 
	{
		File f1=new File("E:/abc/hello/test");
		System.out.println(f1.exists());
		System.out.println(f1.mkdir());
		System.out.println(f1.exists());
		System.out.println("done");
	}
}