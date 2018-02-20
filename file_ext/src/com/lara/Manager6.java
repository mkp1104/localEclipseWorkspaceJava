package com.lara;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
class E implements Serializable
{ 
	int i;
	double j;
	boolean flag;
	String s1;
}
public class Manager6
{
	public static void main(String[] args) throws Exception 
	{
		E e1=new E();
		E e2=new E();
		e1.i=10;
		e1.j=223.34;
		e1.flag=true;
		e1.s1="abc";
		e2.i=20;
		e2.j=20.23;
		e2.flag=false;
		e2.s1="def";
		FileOutputStream fout=new FileOutputStream("test5.txt");
		ObjectOutputStream out=new ObjectOutputStream(fout);
		out.writeInt(e1.i);
		out.writeDouble(e2.j);
		out.writeBoolean(e2.flag);
		out.writeUTF(e1.s1);
		out.flush();
		out.close();
		System.out.println("Writting done !!! !");
		System.out.println("Now Reading..... !!! !");
		FileInputStream fin= new FileInputStream("test5.txt");
		ObjectInputStream in=new ObjectInputStream(fin);
		System.out.println(in.readInt());
		System.out.println(in.readDouble());
		System.out.println(in.readBoolean());
		System.out.println(in.readUTF());
	}
}