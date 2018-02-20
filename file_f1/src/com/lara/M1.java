package com.lara;
import java.io.File;
import java.io.IOException;
public class M1
{
	public static void main(String[] args) throws IOException 
	{
		File f1=new File("E:/lab","abc");
		File f2=new File("E:/lab","test");
		
		System.out.println(f1.createNewFile());
		System.out.println(f2.mkdir());
	}
}