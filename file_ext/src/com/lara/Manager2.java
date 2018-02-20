package com.lara;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
class B
{
	int i;
	boolean flag;
	double j;
	String s1;
}
public class  Manager2
{
	public static void main(String args[]) throws Exception
{
		doexternalize();
		doDeexternalize();
}
private static void doexternalize() throws Exception
	{
	B b1=new B();
	b1.i=10;
	b1.j=20.23;
	b1.flag=true;
	b1.s1="abc";
	FileOutputStream fout=new FileOutputStream("test1.txt");
	ObjectOutputStream out=new ObjectOutputStream(fout);
	out.writeInt(b1.i);
	out.writeDouble(b1.j);
	out.writeBoolean(b1.flag);
	out.writeUTF(b1.s1);
	out.flush();
	out.close();
	System.out.println("writting done!!!");
	
	}
	private static void doDeexternalize() throws Exception
	{
	FileInputStream fin=new FileInputStream("test1.txt");
	ObjectInputStream in=new ObjectInputStream(fin);
	System.out.println("after reading ! !!!");
	System .out.println(in.readInt());
	System.out.println(in.readDouble());
	System.out.println(in.readBoolean());
	System.out.println(in.readUTF());
	}
}
