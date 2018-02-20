package com.lara;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.IOException;
import java.lang.Exception;
class B implements Serializable
{
	int i;
	String s1;
	Boolean flag;
B(int i,String s1,Boolean flag)
	{
	this.i=i;
	this.s1=s1;
	this.flag=flag;
	
	}
	@Override
		public String toString()
	{
	return i+","+s1+","+flag;
	}
}
public class Manager2
{
	public static void main(String[] args) 
	{
		doSerializationDemo();
		doDeSerializationDemo();
	}
	private static void doSerializationDemo()
	{
	B b1=new B(10,"abc",true);
	FileOutputStream fout=null;
	ObjectOutputStream out=null;
	try
	{
		fout=new FileOutputStream("test1.txt");
		out=new ObjectOutputStream(fout);
	out.writeObject(b1);
	System.out.println("wrote into file");
	}
	catch (IOException ex)
	{
		System.out.println(ex);
	}
	finally()
		{
			try
			{
				if(out!=null)
				{
				out.flush();
				out.close();
				out=null;
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
		}
	}
	private static void doDeSerializationDemo() 
	{
	FileInputStream fin=null;
	ObjectInputStream in=null;
	try
	{
		fin=new FileInputStream("test1.txt");
		in=new ObjectInputStream(fin);
		B b1=(B)in.readObject();
		System.out.println(b1);	
	}
	catch(IOException ex)
	{
		System.out.println(ex);
	}
	catch(ClassNotFoundException ex)
		{
		System.out.println(ex);
		}
	finally()
		{
			try
			{
				if(in!=null)
				{
				in.close();
				in=null;
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