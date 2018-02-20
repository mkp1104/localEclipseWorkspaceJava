package jdbc_app1;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.io.IOException;
import java.sql.PreparedStatement;

public class Manager2 {
public static void main(String[] args) {
	Connection con=null;
	PreparedStatement pst=null;
	try {
		con=DBUtil.getConnection();
		pst=con.prepareStatement("insert into person1 values(19,to_timestamp('14-06-1988 10:21:45','DD-MM-YYYY HH24:MI:SS'),to_date('22-01-2012 9:33:59','DD-MM-YYYY HH24:MI:SS'),?)");
		pst.setObject(1,getPhoto());
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
File f1=new File("new_once_more.jpg");
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

