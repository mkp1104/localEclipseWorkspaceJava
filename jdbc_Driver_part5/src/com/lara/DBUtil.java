package com.lara;
import java.sql.SQLException;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;
import java.io.FileReader;
public class DBUtil {
	private static String driverClass;
	private static String url;
	private static String username;
	private static String password;
	static
	{

		FileReader fin=null;
		Properties pr=new Properties();
		try
	{
		fin=new FileReader("constant.properties");
		pr.load(fin);
	}
	catch(IOException ex)
	{
		ex.printStackTrace();
	
	}
	finally
	{
		try
		{
		
				if(fin!=null)
				{
			fin.close();
			fin=null;
				}
			}
			catch(IOException ex)
			{
				ex.printStackTrace();
				
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
		ex.printStackTrace();
	}
	}


public static Connection getConnection() throws SQLException
{
	
	Connection con=DriverManager.getConnection(url,username,password);	
	return con;
	
	
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