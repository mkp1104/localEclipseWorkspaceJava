package com.lara;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;

public class Manager11 {
public static void main(String arg[])
{
						Connection con=null;
						Statement st=null;
						
						try
						{
							con=DBUtil.getConnection();
							st=con.createStatement();
							StringBuffer sb=new StringBuffer();
							sb.append("create or replace procedure p5(sno int,name varchar)");
							sb.append("as begin ");
							sb.append("insert into tab3 values(sno,name);");
							sb.append("insert into emp values(sno,name,44,898900);");
							sb.append("end;");
							st.execute(sb.toString());
							System.out.println(sb);
							System.out.println("done");
							}
						catch(SQLException ex)
							{
								System.out.println(ex);
								
							}
							finally
							{
								DBUtil.closeAll(null, st, con);
								
							}
							
}
}
