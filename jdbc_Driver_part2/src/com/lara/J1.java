package com.lara;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
public class J1 {
		public static void main(String args[]) 
		{
			Connection con=null;
			Statement st=null; 
			try
			{
			 con=FUtil.getConnection();
			 st=con.createStatement();
			 String s1="create sequence tab3_sequence minvalue 1 start with 2 increment by 1 cache 10";
			 boolean status=st.execute(s1);
			 System.out.println(status);
			 System.out.println("sequence created !!!");	
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