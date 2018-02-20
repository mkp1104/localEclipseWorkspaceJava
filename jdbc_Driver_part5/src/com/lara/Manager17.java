package com.lara;
import java.sql.Connection;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

public class Manager17 {
public static void main(String arg[])
{
						Connection con=null;
						CallableStatement cst=null;
						try
						{
							con=DBUtil.getConnection();
							cst=con.prepareCall("{call p7(?,?,?,?)}");
							cst.registerOutParameter(1, Types.INTEGER);
							cst.registerOutParameter(2, Types.VARCHAR);
							cst.registerOutParameter(3, Types.INTEGER);
							cst.setInt(4, 1122);
							cst.execute();
							System.out.println(cst.getInt(1));
							System.out.println(cst.getString(2));
							System.out.println(cst.getInt(3));
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