package com.lara;
import java.io.File;
import java.io.IOException;
public class L
{
	public static void main(String[] args) 
	{
		File f1=new File("abc");
		File f2=new File(f1,"abc");
		
		System.out.println(f2.mkdir());
	}
}