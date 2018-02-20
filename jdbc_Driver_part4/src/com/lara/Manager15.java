package com.lara;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class Manager15 {
public static void main(String arg[])
{
						Connection con=null;
						PreparedStatement pst=null;
						ResultSet rs=null;
						try
						{
							con=Manager3.getConnection();
						
							pst=con.prepareStatement("select * from tab3");
							rs=pst.executeQuery();
							while(rs.next())
							{
								System.out.println(rs.getInt(1)+",");		
								System.out.println(rs.getString(2)+",");		
							}
						}
								catch(SQLException ex)
							{
								System.out.println(ex);
								
							}
							finally
							{
								Manager3.closeAll(null, pst, con);
								
							}
							
}
}