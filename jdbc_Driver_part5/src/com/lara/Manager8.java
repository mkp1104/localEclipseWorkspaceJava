package com.lara;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;

public class Manager8 {
public static void main(String arg[])
{
						Connection con=null;
						Statement st=null;
						
						try
						{
							con=DBUtil.getConnection();
							st=con.createStatement();
							StringBuffer sb=new StringBuffer();
							sb.append("create or replace procedure p4(arg1 int,arg2 varchar,arg3 int,arg4 int) ");
							sb.append("as begin ");
							sb.append("insert into tab3 values(arg1,arg2,arg3);");
							sb.append("insert into emp values(arg1,arg2,arg3,arg4);");
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
