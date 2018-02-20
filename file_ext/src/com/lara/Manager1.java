package com.lara;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
public class  Manager1
{
	public static void main(String args[]) throws Exception
{
	A a1=new A();
	a1.i=10;
	a1.j=20;
	File f=new File("test.txt");
	FileWriter fr=new FileWriter("test.txt");
	FileOutputStream fout=new FileOutputStream(f);
//	FileOutputStream fout=new FileOutputStream(fr);
	ObjectOutputStream out=new ObjectOutputStream(fout);
	out.writeInt(a1.i);
	out.writeDouble(a1.j);
	out.flush();
	out.close();
	System.out.println("writting done!!!");
	FileInputStream fin=new FileInputStream("test.txt");
	ObjectInputStream in=new ObjectInputStream(fin);
	System.out.println("after reading ! !!!");
	System.out.println(in.readInt());
	double y=in.readDouble();
	System.out.println(y);
}
}
