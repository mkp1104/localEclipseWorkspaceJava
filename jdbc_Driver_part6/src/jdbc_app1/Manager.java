package jdbc_app1;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


public class Manager
{
		public static void main(String arg[])
		{
								Connection con=null;
								Statement st=null;
								
								try
								{
									con=DBUtil.getConnection();
									st=con.createStatement();
									String sql="create table person1(PID number,DOJ TimeStamp,DOB date,Photo blob)";
									st.execute(sql);
									System.out.println("done");
								}
								catch(SQLException ex)
									{
										System.out.println(ex);
										
									}
									finally
									{
										DBUtil.closeAllConnection(null, st, con);
										
									}
									
		}
		}



