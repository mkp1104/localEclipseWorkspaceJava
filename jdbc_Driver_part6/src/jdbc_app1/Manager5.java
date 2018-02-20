package jdbc_app1;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class Manager5 {
public static void main(String[] args) {
	Connection con=null;
	PreparedStatement pst=null;
	ResultSet rs=null;
	try {
		con=DBUtil.getConnection();
		pst=con.prepareStatement("select to_char(dob,'DD-MON-YYYY HH24:MI:SS') as Date_birth,To_Char(doj,'DD-MM-YYYY HH24:MI:SS')as Date_Join from person1");
		pst.executeUpdate();
		rs=pst.executeQuery();
	while(rs.next())
	{
		System.out.println(rs.getString("Date_Birth"));
		System.out.println(rs.getString("Date_Join"));
		System.out.println("done");
	}
	
	} catch (Exception e) {
		System.out.println(e);
	}
	finally
	{
		DBUtil.closeAllConnection(rs,pst,con);
		
	}
	}
}

