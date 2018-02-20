package com.lara;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;
public class EUtil {
	static {	
	try
			{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");	
			}
			catch(ClassNotFoundException ex)
			{
				System.out.println(ex);
			}
	}
		public static Connection getConnection()
		{
			Connection con=null;
			try
			{
			
		con=DriverManager.getConnection("jdbc:odbc:db-dsn","system","system123s");
			return con;
			}
			catch(SQLException ex)
			{
				System.out.println(ex);
				
			}
		}
		
		
		public static void closeResultSet(ResultSet rs){
		
		try
				{
					if(rs!=null)
					{
						rs.close();
						rs=null;
					}
					
				}
				catch(SQLException ex)
				{
					System.out.println(ex);
				}
		}
		public static void closeStatement(Statement st)
		{
				try
				{
					if(st!=null)
					{
						st.close();
						st=null;
					}
					
				}
				catch(SQLException ex)
				{
					System.out.println(ex);
				}
		}
		public static void closeConnection(Connection con)
		{
		try
				{
					if(con!=null)
					{
						con.close();
						con=null;
						
					}
				}
					catch(SQLException ex)
					{
						System.out.println(ex);
						
					}
			}
}
		