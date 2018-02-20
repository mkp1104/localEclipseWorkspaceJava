package com.lara;
import java.sql.Connection;
import java.sql.CallableStatement;
import java.sql.SQLException;

public class Manager10 {
public static void main(String arg[])
{
						Connection con=null;
						CallableStatement cst=null;
						
						try
						{
							con=DBUtil.getConnection();
						
							cst=con.prepareCall("{call p4(?,?,?,?)}");
							cst.setInt(1, 1120);
							cst.setString(2, "hello");
							cst.setInt(3,23);
							cst.setInt(4, 89000);
							cst.execute();
							System.out.println("done");
							
							cst.setInt(1, 1121);
							cst.setString(2, "hello-2");
							cst.setInt(3,24);
							cst.setInt(4, 90000);
							cst.execute();
							System.out.println("done Again");
							}
						catch(SQLException ex)
							{
								System.out.println(ex);
								
							}
							finally
							{
								DBUtil.closeAll(null, cst, con);
								
							}
}
}