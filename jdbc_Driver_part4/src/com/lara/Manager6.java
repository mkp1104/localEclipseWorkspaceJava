package com.lara;
import java.sql.Connection;

import java.sql.Statement;
import java.sql.SQLException;

public class Manager6 {
public static void main(String arg[])
{
						Connection con=null;
						Statement st=null;
						try
						{
							con=Manager3.getConnection();
							st=con.createStatement();
							String s1="insert into tab3 values(4,'ramu',32)";
							String s2="insert into tab3 values(5,'vijay',35)";
							st.executeUpdate(s1);
							System.out.println("one Query done!!!");
							st.executeUpdate(s2);
							System.out.println("2nd query done!!!");
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
