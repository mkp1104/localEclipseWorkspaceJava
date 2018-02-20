package com.lara;
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
		public static Connection getConnection(Connection con)
		{
			try
			{
			
		Connection	con=DriverManager.getConnection("jdbc:odbc:db-dsn","system","system123");
			return con;
			}
			catch(SQLException ex)
			{
				System.out.println(ex);
				
			}
		}
		public static Statement getStatement(Statement st)
		{
		try{
			Statement st=con.createStatement();
		return st;
		}
		catch(SQLException ex)
		{
			
		}
		
		String s1="select * from employees";
				rs=st.executeQuery(s1);
			 rsmd=rs.getMetaData();
				int cols=rsmd.getColumnCount();
				while(rs.next())
				{
					for(int i=1;i<=cols;i++)
					{
					System.out.print(rs.getString(i)+"-");	
					}
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