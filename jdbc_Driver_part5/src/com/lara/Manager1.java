package com.lara;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;

public class Manager1 {
public static void main(String arg[])
{
						Connection con=null;
						Statement st=null;
						
						try
						{
							con=DBUtil.getConnection();
							st=con.createStatement();
							String s1="create table emp(sno int,name varchar(90),age int,salary int)";
							st.execute(s1);
							System.out.println("done");
						}
						catch(SQLException ex)
							{
								System.out.println(ex);
								
							}
							finally
							{
								DBUtil.closeAll(null, st, con);
								
							}
							
}
}
