package com.lara;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;

public class Manager13 {
public static void main(String arg[])
{
						Connection con=null;
						Statement st=null;
						
						try
						{
							con=DBUtil.getConnection();
							st=con.createStatement();
							StringBuffer sb=new StringBuffer();
							sb.append("create or replace procedure p6(arg1 out varchar)");
							sb.append("as begin ");
							sb.append("select name into arg1 from emp where sno=1211;");
							sb.append("end;");
						//	st.execute(sb); here sb.toString() is not Automatically called
							st.execute(sb.toString());
							System.out.println(sb);//here sb.toString() is Automatically called only in println!!!
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
