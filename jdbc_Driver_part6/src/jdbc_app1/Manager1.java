package jdbc_app1;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;

public class Manager1 {
public static void main(String[] args) {
	Connection con=null;
	PreparedStatement pst=null;
	try {
		con=DBUtil.getConnection();
		pst=con.prepareStatement("insert into person1 values(?,?,?,?)");
		pst.setInt(1,12);
		pst.setTimestamp(2,new java.sql.Timestamp(0));
		pst.setDate(3, new java.sql.Date(0));
		pst.setObject(4,getPhoto());
		pst.executeUpdate();
		java.util.Date d1=new java.util.Date();
	//	System.out.println(d1.getTime());
		java.sql.Date d2=new java.sql.Date(d1.getTime());
	//	java.sql.Date d2=new java.sql.Date(d1);
	Timestamp ts=new Timestamp(d1.getTime());
	pst.setInt(1,15);
	pst.setTimestamp(2,ts);
	pst.setDate(3, d2);
	pst.setObject(4,getPhoto());
	pst.executeUpdate();
	
System.out.println("done");
	} catch (Exception e) {
		System.out.println(e);
	}
	finally
	{
		DBUtil.closeAllConnection(null,pst,con);
		
	}
	}

private static byte[] getPhoto()
{
FileInputStream fin=null;
BufferedInputStream bin=null;
File f1=new File("new.jpg");
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

