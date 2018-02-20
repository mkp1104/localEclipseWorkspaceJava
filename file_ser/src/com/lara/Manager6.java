package com.lara;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
class G implements Serializable
{
	int i;
	
}
class H extends G
{
	int j;
}


public class Manager6
{
	public static void main(String[] args) throws Exception
	{
		serialize();
		deSerialize();
	}
	private static void serialize() throws Exception
	{

		H h1=new H();
		h1.i=10;
		h1.j=20;
	FileOutputStream fout=new FileOutputStream("test5.txt");
	ObjectOutputStream out=new ObjectOutputStream(fout);
	out.writeObject(h1);
	System.out.println("WROTE IN THE FILE");
	}
	private static	void deSerialize() throws Exception
	{
	FileInputStream fin=new FileInputStream("test5.txt");
	ObjectInputStream in=new ObjectInputStream(fin);
	H h1=(H)in.readObject();
	System.out.println(h1.i);
	System.out.println(h1.j);
	}
}