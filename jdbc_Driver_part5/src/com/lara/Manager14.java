package com.lara;
import java.sql.Connection;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

public class Manager14 {
public static void main(String arg[])
{
						Connection con=null;
						CallableStatement cst=null;
						
						try
						{
							con=DBUtil.getConnection();
							cst=con.prepareCall("{call p6(?)}");
							cst.registerOutParameter(1, Types.VARCHAR);
							cst.execute();
							System.out.println(cst.getString(1));
						//	System.out.println(cst.getString(2));
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