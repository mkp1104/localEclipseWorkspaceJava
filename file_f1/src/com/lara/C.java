package com.lara;
import java.io.File;
import java.io.IOException;
public class C
{
	public static void main(String[] args) 
	{
		File f1=new File("Resume.docx");
		System.out.println(f1.delete());
		
	//		f1.deleteOnExit();
		File f2=new File("Resume.docx");
		
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
