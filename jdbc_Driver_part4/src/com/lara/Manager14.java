package com.lara;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Manager14 {
public static void main(String arg[])
{
						Connection con=null;
						PreparedStatement pst=null;
						
						try
						{
							con=Manager3.getConnection();
						
							pst=con.prepareStatement("update tab3 set name=? where sno=?");
							pst.setString(1,"waquas");
							pst.setInt(2, 12);
							
							pst.executeUpdate();
								
								System.out.println("done");		
								pst.setString(1,"akshy" );
								pst.setInt(2,13);
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