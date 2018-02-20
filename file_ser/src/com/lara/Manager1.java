package com.lara;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.Exception;
class A implements Serializable
{
	int i;
	double j;
}

public class Manager1
{
	public static void main(String[] args) throws Exception 
	{
		doSerialization();
		doDeSerialization();
	}
	private static void doSerialization() throws Exception
	{
	A a1=new A();
	a1.i=10;
	a1.j=10.9;
	FileOutputStream fout=new FileOutputStream("test.log");
	ObjectOutputStream out=new ObjectOutputStream(fout);
	out.writeObject(a1);
	out.flush();
	out.close();
	System.out.println("wrote into the file");
	}
	private static void doDeSerialization() throws Exception
	{
	FileInputStream fin=new FileInputStream("test.txt");
	ObjectInputStream in=new ObjectInputStream(fin);
	A a1=(A)in.readObject();
	System.out.println(a1.i);	
	System.out.println(a1.j);	
	}
	
	}