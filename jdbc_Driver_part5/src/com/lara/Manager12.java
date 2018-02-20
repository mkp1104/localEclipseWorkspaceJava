package com.lara;
import java.sql.Connection;
import java.sql.CallableStatement;
import java.sql.SQLException;

public class Manager12 {
public static void main(String arg[])
{
						Connection con=null;
						CallableStatement cst=null;
						
						try
						{
							con=DBUtil.getConnection();
							
							cst=con.prepareCall("{call p5(?,'abc')}");
							cst.setInt(1, 1122);
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