package jdbc_app1;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.Blob;
import java.sql.ResultSet;
import java.io.IOException;

public class Manager3 {
public static void main(String[] args) {
	Connection con=null;
	ResultSet rs=null;
	Statement st=null;
	
	try {
		con=DBUtil.getConnection();
		st=con.createStatement();
		String sql="select * from person1 where pid=15";
		rs=st.executeQuery(sql);
		while(rs.next())
		{
			Blob b1=(Blob)rs.getBlob("Photo");
			byte[] bytes=b1.getBytes(1,(int)b1.length());
			System.out.println(rs.getString(1));
		//	System.out.println(rs.getString(2));
	//		System.out.println(rs.getString(3));
			System.out.println("-------------");
			System.out.println(rs.getTimestamp(2));
			System.out.println(rs.getDate(3));
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
File f1=new File("new1.jpg");
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