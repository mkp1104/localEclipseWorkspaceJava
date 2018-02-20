package com.lara;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class Manager16 {
public static void main(String arg[])
{
						Connection con=null;
						PreparedStatement pst=null;
						ResultSet rs=null;
						try
						{
							con=Manager3.getConnection();
						
							pst=con.prepareStatement("select * from tab3 where sno>?");
							pst.setInt(1, 12);
							rs=pst.executeQuery();
							while(rs.next())
							{
								System.out.print(rs.getInt(1)+",");		
								System.out.print(rs.getString(2)+",");		
								System.out.print(rs.getInt(3));							
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