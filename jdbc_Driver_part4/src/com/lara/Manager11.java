package com.lara;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Manager11 {
public static void main(String arg[])
{
						Connection con=null;
						PreparedStatement pst=null;
						
						try
						{
							con=Manager3.getConnection();
						
							pst=con.prepareStatement("insert into tab3 values(?,?,?)");
							pst.setInt(1,11 );
							pst.setString(2,"waquas");
							pst.setInt(3, 24);
							
							pst.executeUpdate();
								
								System.out.println("done");		
								pst.setInt(1,12 );
								pst.setString(2,"pratik");
								
								pst.setInt(3, 22);
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