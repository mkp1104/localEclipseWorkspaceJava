package com.lara;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
class C
{
	int i;
	int y;
	double j;
	String s1;
}
public class  Manager3
{
	public static void main(String args[]) throws Exception
{
		doexternalize();
		doDeexternalize();
}
private static void doexternalize() throws Exception
	{
	C c1=new C();
	c1.i=10;
	c1.j=20.23;
	c1.s1="abc";
	FileOutputStream fout=new FileOutputStream("test2.txt");
	ObjectOutputStream out=new ObjectOutputStream(fout);
	out.writeInt(c1.i);
	out.writeInt(c1.y);
	out.writeDouble(c1.j);
	out.writeUTF(c1.s1);
	out.flush();
	out.close();
	System.out.println("writting done!!!");
	
	}
	private static void doDeexternalize() throws Exception
	{
	FileInputStream fin=new FileInputStream("test2.txt");
	ObjectInputStream in=new ObjectInputStream(fin);
	System.out.println("after reading ! !!!");
	System.out.println(in.readInt());
	System.out.println(in.readInt());
//	System.out.println(in.readDouble());
	System.out.println(in.readUTF());
	}
}
