package com.misys.payments;

import java.lang.instrument.Instrumentation;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class J implements Serializable
{
	int x;
	J()
	{
	System.out.println("J()");
	}
	
}


public class CalculateObjectSize implements Serializable
{
	private static Instrumentation instrumentation;
	
	public static long getObjectSize(Object o) {
        return instrumentation.getObjectSize(o);
    }
	public static void main(String[] args) throws Exception
	{
		J j1=new J();
		j1.x=100;
		Util.serialize(j1,"test7.txt");
		System.out.println("-----");
		J j2= (J)Util.deSerialize("test7.txt");
		System.out.println(j2.x);
	//	Serializable ser = null;
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(baos);
		oos.writeObject(j2);
		oos.close();
		System.out.println("size of Object: " + baos.size());
			System.out.println("size of Object-instrumentation: " + instrumentation.getObjectSize(j2));
		//	System.out.println("size of Object-instrumentation: " + instrumentation.getObjectSize(j2));
	}
}