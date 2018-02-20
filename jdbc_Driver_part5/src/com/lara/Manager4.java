package com.lara;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;

public class Manager4 {
public static void main(String arg[])
{
						Connection con=null;
						Statement st=null;
						
						try
						{
							con=DBUtil.getConnection();
							st=con.createStatement();
							StringBuffer sb=new StringBuffer();
							sb.append("create or replace procedure p3 ");
							sb.append("as begin ");
							sb.append("insert into emp values(1,'abc',22,80000);");
							sb.append("update emp set name='mkp' where sno=2;");
							sb.append("delete from emp  where sno=3;");
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
