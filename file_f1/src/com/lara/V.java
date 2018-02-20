package com.lara;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class V
{
	public static void main(String[] args) throws IOException 
	{
		File f1=new File("test.txt");
		
		FileReader in=null;
		try
		{
			in=new FileReader(f1);
			char x[]=new char[(int)f1.length()];
			in.read(x);
			String s1=new String(x);
			System.out.println(s1);
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
		finally 
		{
		try
		{
			if(in!=null)
			{
			in.close();
			in=null;//for garbage collector making this object dead....
			}
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
			}
		}
	}
}