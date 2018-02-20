package com.lara;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;

public class Manager2121 {
public static void main(String arg[])
{
						Connection con=null;
						Statement st=null;
						
						try
						{
							con=DBUtil.getConnection();
							st=con.createStatement();
							StringBuffer sb=new StringBuffer();
							sb.append("create or replace procedure p5 as begin insert into emp values(1,'abc',22,80000);insert into emp values(2,'xyz',23,90900);end;");
							st.execute(sb.toString());
							System.out.println(sb);
							System.out.println(sb.toString());
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
