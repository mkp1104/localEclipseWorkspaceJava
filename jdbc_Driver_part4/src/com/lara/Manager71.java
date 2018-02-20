
package com.lara;
import java.sql.Connection;

import java.sql.Statement;
import java.sql.SQLException;

public class Manager71 {
public static void main(String arg[])
{
						Connection con=null;
						Statement st=null;
						try
						{
							con=Manager3.getConnection();
							st=con.createStatement();
							String s1="insert into tab3 values(6,'ramu',32)";
							String s2="insert into tab3 values(7,'ramesh',35)";
							String s3="insert into tab3 values(8,'vijay',35)";
							con.setAutoCommit(false);
							st.executeUpdate(s1);
							System.out.println("one Query done!!!");
							st.executeUpdate(s2);
							System.out.println("2nd query done!!!");
							st.executeUpdate(s3);
							System.out.println("3rd query done!!!");
						
						//	con.commit();
						}
						catch(SQLException ex)
							{
								System.out.println(ex);
								try
								{
									con.rollback();
									
								}
								catch(SQLException exm)
								{
									System.out.println(exm);
								}
								
							}
							finally
							{
								Manager3.closeAll(null, st, con);
								
							}
							
}
}