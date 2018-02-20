package com.lara;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
class D implements Serializable
{
	int i;
	static int j;
}


public class Manager4
{
	public static void main(String[] args) throws Exception
	{
		serialize();
		deSerialize();
	}
	private static void serialize() throws Exception
	{

		D d1=new D();
		d1.i=10;
		d1.j=20;
	FileOutputStream fout=new FileOutputStream("test3.txt");
	ObjectOutputStream out=new ObjectOutputStream(fout);
	out.writeObject(d1);
	System.out.println("WROTE IN THE FILE");
	}
	private static	void deSerialize() throws Exception
	{
	FileInputStream fin=new FileInputStream("test3.txt");
	ObjectInputStream in=new ObjectInputStream(fin);
	D d1=(D)in.readObject();
	System.out.println(d1.i);
	System.out.println(d1.j);
	}
}