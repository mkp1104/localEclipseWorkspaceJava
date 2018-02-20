package com.lara;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
public class C {
		public static void main(String args[])
		{
			try
			{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");	
			}
			catch(ClassNotFoundException ex)
			{
				System.out.println(ex);
			}
			Connection con=null;
			Statement st=null;
			ResultSet rs=null;
			try
			{
			
			con=DriverManager.getConnection("jdbc:odbc:db-dsn","system","system123");
				st=con.createStatement();
				String s1="select * from employees";
				rs=st.executeQuery(s1);
				while(rs.next())
				{
					System.out.print(rs.getInt(1)+",");
					System.out.print(rs.getString(2)+"-");
					System.out.print(rs.getString(3)+",");
					System.out.print(rs.getInt(4));
					System.out.println();
				}
				
			}
			
			catch(SQLException ex)
			{
				System.out.println(ex);
			}
			finally
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
		}