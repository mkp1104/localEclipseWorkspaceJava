package com.pratian.app;

import java.io.*;

class ExceptionDemo1 
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
			reader.close(); // FileReader not closed as an Exception is thrown earlier
		}
		catch(FileNotFoundException fe)
		{
			System.out.println("MyFile.txt not found...");
		}
		catch(IOException ie)
		{
			System.out.println("Cannot read from MyFile.txt...");
		}
	}
}
