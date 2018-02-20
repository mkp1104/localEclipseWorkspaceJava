package com.pratian.app;

import java.io.*;

class ExceptionDemo2 
{
	public static void main(String[] args) 
	{
		int total = 0;
		FileReader reader = null; 
		try
		{
			reader = new FileReader("MyFile.txt");
			while(reader.read() != -1)
				++total;
			System.out.println("Total characters in the file "+total);
		}
		catch(FileNotFoundException fe)
		{
			System.out.println("MyFile.txt not found...");
		}
		catch(IOException ie)
		{
			System.out.println("Cannot read from MyFile.txt...");
		}
		finally
		{
			System.out.println("Closing the reader in the finally block...");
			try
			{
				reader.close();
			}
			catch(IOException ie)
			{
				System.out.println("Unable to close the reader...");
			}
		}
	}
}
