package com.lara;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;
public class A1 {
		public static void main(String args[])
		{
			Connection con=null;
			Statement st=null;
			try
			{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");	
				con=DriverManager.getConnection("jdbc:odbc:db-dsn","system","system123");
				st=con.createStatement();
				String s1="create table tab10(s_no int,Name varchar(8),email varchar(8))";
				st.execute(s1);
			System.out.println("done");	
			}
			catch(ClassNotFoundException ex)
			{
				System.out.println(ex);
			}
			catch(SQLException ex)
			{
				System.out.println(ex);
			}
			finally
			{
				try
				{
					if(st!=null)
					{
						st.close();//one of the type of abnormal condition!!!!
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
		}