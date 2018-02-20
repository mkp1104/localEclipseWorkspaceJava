package com.lara;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
class L implements Serializable
{
	int x;
	
	
}


public class Manager10
{
	public static void main(String[] args) throws Exception
	{
			L obj1=new L();
			obj1.x=100;
		Util.serialize(obj1,"test9.txt");

			System.out.println("-----");
		L obj2= (L)Util.deSerialize("test9.txt");
		System.out.println(obj2.x);
		obj2.x=200;
		System.out.println(obj1.x);
		obj1.x=300;
		System.out.println(obj2.x);
	}
}