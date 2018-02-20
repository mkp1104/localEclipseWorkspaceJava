package com.lara;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class U1
{
	public static void main(String[] args) throws IOException 
	{
		FileWriter o=null;
		try
		{
			o=new FileWriter("test.txt");
			o.write("hello123\njava and");
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
		//	o=null;
			}
		}
		catch (IOException ex)
		{

			ex.printStackTrace();
		}
		}
	}
}