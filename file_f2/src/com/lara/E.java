package com.lara;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;

public class E
{
	public static void main(String[] args) throws IOException 
	{
		File f1=new File("D:\\entertainment\\Wallpepar\\1.jpg");
		File f2=new File("E:\\Mkp.jpg");
		FileInputStream fin=null;
		FileOutputStream fout=null;
		BufferedInputStream bin=null;
		BufferedOutputStream bout=null;
		try
		{
			fin=new FileInputStream(f1);
			bin= new BufferedInputStream(fin);
			byte[] b=new byte[(int)f1.length()];
			bin.read(b);
			System.out.println(b);
			fout=new FileOutputStream(f2);
			bout=new BufferedOutputStream(fout);
			bout.write(b);
			System.out.println("Done");
		}
		catch(IOException ex)
		{
		System.out.println(ex);
		}
		finally
		{
		try
		{
			if(bout!=null)
			{
			bout.flush();
			bout.close();
			bout=null;
			
			}
		}
		catch (IOException ex)
		{
				System.out.println(ex);
		}
		try
		{
			if(fout!=null)
			{
			fout.close();
			fout=null;
			}
		}
		catch (IOException ex)
		{
				System.out.println(ex);
		}
		
		try
		{
			if(bin!=null)
			{
			
			bin.close();
			bin=null;
			
			}
		}
		catch (IOException ex)
		{
				System.out.println(ex);
		}
		try
		{
			if(fin!=null)
			{
			fin.close();
			fin=null;
			}
		}
		catch (IOException ex)
		{
				System.out.println(ex);
		}
		}
	}
}