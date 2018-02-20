package com.lara;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class Manager5 {
public static void main(String arg[])
{
						Connection con=null;
						Statement st=null;
						ResultSet rs=null;
						try
						{
							con=Manager3.getConnection();
							st=con.createStatement();
							String sql="select * from tab3";
							rs=st.executeQuery(sql);
							while(rs.next())
							{
								System.out.println(rs.getString(1)+",");
								System.out.println(rs.getString(2)+",");
								
							}
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
