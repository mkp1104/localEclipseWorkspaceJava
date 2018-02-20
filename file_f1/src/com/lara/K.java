package com.lara;
import java.io.File;
import java.io.IOException;
public class K
{
	public static void main(String[] args) 
	{
		File f1=new File("E:/lab");
		File f2=new File(f1,"hello.txt");
		try
		{
			System.out.println(f2.createNewFile());
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
		System.out.println("done");
	}
}