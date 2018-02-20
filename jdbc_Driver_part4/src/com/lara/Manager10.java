package com.lara;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Manager10 {
public static void main(String arg[])
{
						Connection con=null;
						PreparedStatement pst=null;
						
						try
						{
							con=Manager3.getConnection();
						String s1="insert into tab3 values(8,'akshay',25)";
							pst=con.prepareStatement(s1);
							pst.executeUpdate();
								
								System.out.println("done");		
pst.executeUpdate();
								
								System.out.println("done");		
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