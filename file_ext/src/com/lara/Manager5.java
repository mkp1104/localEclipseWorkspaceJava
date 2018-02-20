package com.lara;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectOutput;
import java.io.ObjectInput;
import java.io.Externalizable;
import java.io.IOException;
import java.lang.ClassNotFoundException;
class D implements Externalizable
{
	int i;
	double j;
	String s1;
	@Override
	public void writeExternal(ObjectOutput output) throws IOException
	{
	output.writeInt(i);
	output.writeDouble(j);
	output.writeUTF(s1);
	output.flush();
	output.close();
	}
	@Override
	public void readExternal(ObjectInput in) throws IOException,ClassNotFoundException
	{
	i=in.readInt();
	j=in.readDouble();
	s1=in.readUTF();
/*	System .out.println(in.readInt());
	System.out.println(in.readDouble());
	System.out.println(in.readUTF());
*/	
	}
}
public class  Manager5
{
	public static void main(String args[]) throws Exception
{		doexternalize();
		doDeexternalize();
}
private static void doexternalize() throws Exception
	{
		D d1=new D();
		d1.i=100;
		d1.j=267.90;
		d1.s1="abc";
	FileOutputStream fout=new FileOutputStream("test4.txt");
	ObjectOutputStream out=new ObjectOutputStream(fout);
	d1.writeExternal(out);
	System.out.println("writting done!!!");
	}
	private static void doDeexternalize() throws Exception
	{
	D d2=new D();	
	FileInputStream fin=new FileInputStream("test4.txt");
	ObjectInputStream in=new ObjectInputStream(fin);
	System.out.println("after reading ! !!!");
	d2.readExternal(in);
	System.out.println(d2.i);
	System.out.println(d2.j);
	System.out.println(d2.s1);
	}
}
