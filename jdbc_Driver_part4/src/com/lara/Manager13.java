package com.lara;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class Manager13 {
public static void main(String arg[])
{
						Connection con=null;
						PreparedStatement pst=null;
						
						try
						{
							con=Manager3.getConnection();
							pst=con.prepareStatement("update  tab3 set name='naveen'where sno=12");
							pst.executeUpdate();
								
								System.out.println("done");		
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