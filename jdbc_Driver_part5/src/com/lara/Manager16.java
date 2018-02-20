package com.lara;
import java.sql.Connection;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

public class Manager16 {
public static void main(String arg[])
{
						Connection con=null;
						CallableStatement cst=null;
						
						try
						{
							con=DBUtil.getConnection();
							cst=con.prepareCall("{call p7(?,?,?,1122)}");
							cst.registerOutParameter(1, Types.INTEGER);
							cst.registerOutParameter(2, Types.VARCHAR);
							cst.registerOutParameter(3, Types.INTEGER);
							//cst.setInt(4,1);
							cst.execute();
							int age=cst.getInt(1);
							String name=cst.getString(2);
							int salary=cst.getInt(3);
							
							System.out.println(age);
							System.out.println(name);
							System.out.println(salary);
							
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