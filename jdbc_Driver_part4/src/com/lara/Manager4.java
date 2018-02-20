package com.lara;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;

public class Manager4 {
public static void main(String arg[])
{
						Connection con=null;
						Statement st=null;
						
						try
						{
							con=Manager3.getConnection();
							st=con.createStatement();
							String s1="insert into tab3 values(2,'raman',23)";
							st.executeUpdate(s1);
							System.out.println("done");
						}
						catch(SQLException ex)
							{
								System.out.println(ex);
								
							}
							finally
							{
								Manager3.closeAll(null, st, con);
								
							}
							
}
}
