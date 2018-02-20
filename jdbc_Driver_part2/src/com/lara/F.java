package com.lara;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
public class F {
		public static void main(String args[]) 
		{
			Connection con=null;
			Statement st=null;
			try{
			 con=FUtil.getConnection();
			 st=con.createStatement();
			 String s1="insert into tab1 values(2,'mkp','mkp@.com')";
				st.execute(s1);
				System.out.println("values inserted !!!");
			
			}
			catch(SQLException ex)
			{
				System.out.println(ex);
			}
			
				
			finally
			{
				FUtil.closeStatement(st);
				FUtil.closeConnection(con);
			}
		}
}			
		