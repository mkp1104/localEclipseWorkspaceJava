package com.lara;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
class I implements Serializable
{
	int x;
	
}


public class Manager7
{
	public static void main(String[] args) throws Exception
	{
		I obj=new I();
	obj.x=100;
		Util.serialize(obj,"test6.txt");
		System.out.println("-----");
		I obj1= (I)Util.deSerialize("test6.txt");
		System.out.println(obj1.x);
	}
}