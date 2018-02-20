package com.lara;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
class K implements Serializable
{
	int x;
	K()
	{
	System.out.println("K()");
	}
	
}


public class Manager9
{
	public static void main(String[] args) throws Exception
	{
		K k1=new K();
		k1.x=100;
		Util.serialize(k1,"test8.txt");
		System.out.println("-----");
		K k2= (K)Util.deSerialize("test8.txt");
		System.out.println(k1==k2);
	}
}