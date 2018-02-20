package com;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Blob;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.sql.rowset.serial.SerialBlob;
import javax.sql.rowset.serial.SerialException;

import org.hibernate.Session;
public class Manager1 
{
public static void main(String[] args) throws SerialException,SQLException,ParseException
{
	Session s1=Util.openSession();
	Person p1=new Person();
	p1.setId(101);
	p1.setDoj(new Timestamp(0));
	p1.setDob(new Date(0));
	Blob b1=new SerialBlob(getPhoto());
	p1.setPhoto(b1);
	s1.beginTransaction();
	s1.save(p1);
	s1.getTransaction().commit();
	s1.flush();
	s1.close();
	System.out.println("done");
	
}

private static byte[] getPhoto()
{
FileInputStream fin=null;
BufferedInputStream bin=null;
File f1=new File("D:\\entertainment\\Wallpepar\\3.jpg");
byte[] b=new byte[(int)f1.length()];

try {
	fin=new FileInputStream(f1);
	bin=new BufferedInputStream(fin);
	bin.read();
	
} catch (IOException e) {
System.out.println(e);

}
finally
{
	try
	{
		if(bin!=null)
		{
			bin.close();
			bin=null;
			
		}
		
	}
	catch(IOException ex)
	{
		System.out.println(ex);
		
	}
	try
	{
		if(fin!=null)
		{
			fin.close();
			fin=null;
			//System.out.println("ok");
			
		}
	}
		catch(IOException e)
		{
			System.out.println(e);
			
		}
		
	}
return b;
}
}
