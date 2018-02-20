package com.lara;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
public class K {
		public static void main(String args[]) 
		{
			Connection con=null;
			Statement st=null; 
			try
			{
			 con=FUtil.getConnection();
			 st=con.createStatement();
			 String s1="insert into tab2 values( tab2_sequence.nextval,'manish',23)";
			 int status=st.executeUpdate(s1);
			 System.out.println(status);
			 System.out.println("value inserted !!!");	
			}
			catch(SQLException ex)
			{
				System.out.println(ex);
			}
			finally
			{
				FUtil.closeConnection(con);
				FUtil.closeStatement(st);
			}
		}
}