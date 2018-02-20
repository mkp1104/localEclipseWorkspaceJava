package com.lara;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class U
{
	public static void main(String[] args) 
	{
		FileWriter o=null;//if it is not initialized then it will give error for if(o!=null) block
		try
		{
			o=new FileWriter("test.txt");
			o.write("hello123\njava \nand\n");
			System.out.println("done");
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
		finally
		{
		try
		{
			if(o!=null)
			{
			o.flush();
			o.close();
			o=null;
			}
		}
		catch (IOException ex)
		{

			ex.printStackTrace();
		}
		}
	}
}