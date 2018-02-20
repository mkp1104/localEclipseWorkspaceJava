package com.lara;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
class P 
{
	int i=10;
	P()
	{
	System.out.println("P()");
	}
}
class Q extends P implements Serializable
{
int j=20;
Q()
	{
		System.out.println("Q()");
	}
}

class R extends Q 
{
	int k=30;
	R()
	{
	System.out.println("R()");
	}	
}

public class Manager1221
{
	public static void main(String[] args) throws Exception
	{
			R r1=new R();
			P p1=new P();
		Util.serialize(p1,"test12.txt");
	
			System.out.println("-----");
		R r2= (R)Util.deSerialize("test11.txt");
		System.out.println(r2.i);
		P p2= (P)Util.deSerialize("test12.txt");
		System.out.println(p2.i);
	
	}
}