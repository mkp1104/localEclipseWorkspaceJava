package com.lara;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
class C implements Serializable
{
	int i;
	transient double j;
	C(int i,double j)
	{
	this.i=i;
	this.j=j;
	}
	@Override
		public String toString()
	{
	return "i="+i+",j="+j;
	}
}


public class Manager3
{
	public static void main(String[] args) throws Exception
	{
	C c1=new C(90,200.90);
	serializeObject(c1);
	C c2=deSerializeObject();
	System.out.println(c2);
	}
	private static void serializeObject(C c1) throws Exception
	{
	FileOutputStream fout=new FileOutputStream("test2.txt");
	ObjectOutputStream out=new ObjectOutputStream(fout);
	out.writeObject(c1);
	}
	private static C deSerializeObject() throws Exception
	{
	FileInputStream fin=new FileInputStream("test2.txt");
	ObjectInputStream in=new ObjectInputStream(fin);
	C c1=(C)in.readObject();
	return c1;
	}
}