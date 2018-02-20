package com.lara;
import java.sql.Connection;
import java.sql.CallableStatement;
import java.sql.SQLException;

public class Manager9 {
public static void main(String arg[])
{
						Connection con=null;
						CallableStatement cst=null;
						
						try
						{
							con=DBUtil.getConnection();
							cst=con.prepareCall("{call p4(1,'abc',23,81000)}");
							cst.execute();
							System.out.println("done");
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