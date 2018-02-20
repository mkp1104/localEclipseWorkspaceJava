package com.lara;
import java.sql.Connection;
import java.io.FileReader;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.io.IOException;
import java.util.Properties;
public class Manager3 {
	
		private static final String driverClass;
		private static final String url;
		private static final String username;
		private static final String password;
	
		static {
			Properties pr=new Properties();
			FileReader in=null;
			
		try
		{
			in=new FileReader("constants.properties");
			pr.load(in);
		}
		catch(IOException ex)
		{
			System.out.println(ex);
			
		}
		finally
		{
		try
		{
		 		if(in!=null)
				{
					in.close();
					in=null;
					
				}
			}
				catch(IOException ex)
				{
					System.out.println(ex);
					
				}
			}
		
		driverClass=pr.getProperty("driverClass");
		url=pr.getProperty("url");
		username=pr.getProperty("username");
		password=pr.getProperty("password");
		}
		static
		{
			try
			{
						Class.forName(driverClass);
			}
				catch(ClassNotFoundException ex)
				{
					System.out.println(ex);
					
				}	
		}	
	public static Connection getConnection() throws SQLException
	{
		return DriverManager.getConnection(url,username,password);
		
	}
			public static void closeAll(ResultSet rs,Statement st,Connection con)
			{
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
