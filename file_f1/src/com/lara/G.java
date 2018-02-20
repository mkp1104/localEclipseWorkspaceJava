package com.lara;
import java.io.File;
import java.io.IOException;
public class G
{
	public static void main(String[] args) 
	{
		File f1=new File("abcd");
		boolean b1=f1.mkdir();
		System.out.println(b1);
		System.out.println("done");
	}
}