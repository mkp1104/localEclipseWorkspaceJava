package com.lara;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
public class  Manager4
{
	public static void main(String args[]) throws Exception
{
		doexternalize();
		doDeexternalize();
}
private static void doexternalize() throws Exception
	{
	FileOutputStream fout=new FileOutputStream("test3.mp3");
	ObjectOutputStream out=new ObjectOutputStream(fout);
	out.writeInt(100);
	out.writeDouble(20.36);
	out.writeUTF("abc");
	out.flush();
	out.close();
	System.out.println("writting done!!!");
	
	}
	private static void doDeexternalize() throws Exception
	{
	FileInputStream fin=new FileInputStream("test3.mp3");
	ObjectInputStream in=new ObjectInputStream(fin);
	System.out.println("after reading ! !!!");
	System .out.println(in.readInt());
	System.out.println(in.readDouble());
	System.out.println(in.readUTF());
	}
}
