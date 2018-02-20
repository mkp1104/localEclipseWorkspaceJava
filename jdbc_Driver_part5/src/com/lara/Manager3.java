package com.lara;
import java.sql.Connection;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Manager3 {
public static void main(String arg[])
{
						Connection con=null;
					//	CallableStatement cst=null;
						PreparedStatement st=null;
						
						try
						{
							con=DBUtil.getConnection();
						//	cst=con.prepareCall("{call p1}");
							st=con.prepareCall("{call p1}");
						//	cst.execute();
							st.execute();
							System.out.println("done");
							}
						catch(SQLException ex)
							{
								System.out.println(ex);
								
							}
							finally
							{
							//	DBUtil.closeAll(null, cst, con);
								DBUtil.closeAll(null, st, con);
								
							}
}
}