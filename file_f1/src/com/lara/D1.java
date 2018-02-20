package com.lara;
import java.io.File;
import java.io.IOException;
public class D1
{
	public static void main(String[] args) 
	{
		File f1=new File("D:\\tes.html");
		try
		{
			System.out.println(f1.createNewFile());
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
		System.out.println("done");
	}
}
