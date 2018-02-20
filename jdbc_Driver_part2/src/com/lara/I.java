package com.lara;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
public class I {
		public static void main(String args[]) 
		{
			Connection con=null;
			Statement st=null; 
			try
			{
			 con=FUtil.getConnection();
			 st=con.createStatement();
			 String s1="create table tab2(sno int,name varchar(8),age varchar(8))";
			 st.execute(s1);
			 System.out.println("table created !!!");
				
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