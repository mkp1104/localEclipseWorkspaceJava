package com.lara;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class C
{
	public static void main(String[] args) 
	{
		FileWriter o=null;
		BufferedWriter b=null;
		try
		{
			o=new FileWriter("text1.txt");
			b=new BufferedWriter(o);
			b.write("1.hello to all");
			b.newLine();
		
			b.write("2.hello to all");
			b.newLine();
		
			b.write("3.hello to all");
			
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			try
			{
				if(b!=null)
				{
		b.flush();
		b.close();
		b=null;		
				}
			}
			catch (IOException ex)
			{
				ex.printStackTrace();
			}	
		}
		try
		{
			if(o!=null)
			{
			o.close();
			o=null;
			}
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}

		System.out.println("OK");
	}
}
