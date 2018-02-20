package com.lara;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectOutput;
import java.io.ObjectInput;
import java.io.Externalizable;
import java.io.IOException;
import java.io.Serializable;
import java.lang.ClassNotFoundException;
class F implements Externalizable
{
	int i;
	double j;
	String s1;
	@Override
	public void writeExternal(ObjectOutput out) throws IOException
	{
		out.writeInt(i);
		out.writeDouble(j);
		out.writeUTF(s1);
		
	}
	@Override
	public void readExternal(ObjectInput in) throws IOException
	{
	i=in.readInt();
	j=in.readDouble();
	s1=in.readUTF();
	}

}
public class Manager7
{

	public static void main(String[] args) throws Exception 
	{
		externalize();
		deexternalize();
		}
		private static void externalize() throws Exception
		{
			F f1=new F();
			F f2=new F();
			f1.i=10;
			f1.j=10.90;
			f1.s1="abc";
			f2.i=20;
			f2.j=20.23;
			f2.s1="xyz";
			FileOutputStream fout=new FileOutputStream("test6.txt");
			ObjectOutputStream out=new ObjectOutputStream(fout);
			f1.writeExternal(out);
			f2.writeExternal(out);
			out.flush();
			out.close();
			
			System.out.println("writting done !!!");
			}
			private static void deexternalize() throws IOException
			{
				FileInputStream fin=new FileInputStream("test6.txt");
				ObjectInputStream in=new ObjectInputStream(fin);
				F f3=new F();
				F f4=new F();
				f3.readExternal(in);
				f4.readExternal(in);
				System.out.println("Now Reading....... !!!");
				System.out.println(f3.i);
				System.out.println(f3.j);
				System.out.println(f3.s1);
				System.out.println(f4.i);
				System.out.println(f4.j);
				System.out.println(f4.s1);
			}
}