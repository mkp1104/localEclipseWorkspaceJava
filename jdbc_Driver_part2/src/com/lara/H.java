package com.lara;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DatabaseMetaData;
public class H {
		public static void main(String args[]) 
		{
			Connection con=null;
			DatabaseMetaData dbmd=null; 
			try{
			 con=FUtil.getConnection();
			 dbmd=con.getMetaData();
					System.out.println(dbmd.getDatabaseProductName());
					System.out.println(dbmd.getDriverName());
				
			}
			catch(SQLException ex)
			{
				System.out.println(ex);
			}
			finally
			{
				FUtil.closeConnection(con);
			}
		}
}