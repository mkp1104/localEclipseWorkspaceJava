package com.lara;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;

public class Manager15 {
public static void main(String arg[])
{
						Connection con=null;
						Statement st=null;
						
						try
						{
							con=DBUtil.getConnection();
							st=con.createStatement();
							StringBuffer sb=new StringBuffer();
							sb.append("create or replace procedure p7(arg1 OUT INT,arg2 OUT varchar,arg3 OUT INT,arg4 IN int)");
							sb.append("as begin ");
							sb.append("select sno into arg1 from emp where sno=arg4;");
							sb.append("select name into arg2 from emp where sno=arg4;");
							sb.append("select age into arg3 from emp where sno=arg4;");

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
