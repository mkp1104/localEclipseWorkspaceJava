package jdbc_app1;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.Blob;
import java.sql.ResultSet;
import java.io.IOException;
import java.sql.Date;
import java.sql.Timestamp;
public class Manager4 {
public static void main(String[] args) {
	Connection con=null;
	ResultSet rs=null;
	Statement st=null;
	
	try {
		con=DBUtil.getConnection();
		st=con.createStatement();
		String sql="select * from person1 where pid=15";
		rs=st.executeQuery(sql);
		Date d1=null;
		java.util.Date d2=null;
		Timestamp ts=null; 
		while(rs.next())
		{
			Blob b1=(Blob)rs.getBlob("Photo");
			byte[] bytes=b1.getBytes(1,(int)b1.length());
			ts=rs.getTimestamp(2);
			d1=rs.getDate(3);
			System.out.println(ts);//it will give the exact sql format of Date type.
			System.out.println(d1);//----------------------do----------------------.
			System.out.println(rs.getInt(1));//it will give you java prgm lng date format 
	//		d2=new java.util.Date(ts.getTime());//-----------------do--------------------.
	//		System.out.println(d2);
			d2=new java.util.Date(d1.getTime());//-----------------do--------------------.
			System.out.println(d2);
			writeInToFile(bytes);
			System.out.println("----");
		}
		} catch (Exception e) {
		System.out.println(e);
	}
	finally
	{
		DBUtil.closeAllConnection(rs,st,con);
		
	}
}
private static void writeInToFile(byte[] bytes)
{
FileOutputStream fin=null;
BufferedOutputStream bin=null;
File f1=new File("new_once_more.jpg");
try {
	fin=new FileOutputStream(f1);
	bin=new BufferedOutputStream(fin);
	bin.write(bytes);
	
} catch (Exception e) {
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
			System.out.println("ok");
			
		}
	}
		catch(IOException e)
		{
			System.out.println(e);
			
		}
		
	}
}
}