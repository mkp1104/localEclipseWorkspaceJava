package com.lara;
import java.sql.Connection;
import java.util.Scanner;
import java.sql.Statement;
import java.sql.SQLException;

public class Manager8 {
public static void main(String arg[])
{						Scanner sc=new Scanner(System.in);
						Connection con=null;
						Statement st=null;
						String sno,name,sql,decider,age;
						try
						{
							con=Manager3.getConnection();
							st=con.createStatement();
							do{
								System.out.println("enter sno");
								sno=sc.next();
								System.out.println("enter name");
								name=sc.next();
								System.out.println("enter age");
								age=sc.next();
								sql="insert into tab3 values("+sno+",'"+name+"',"+age+")";
								st.executeUpdate(sql);
								System.out.println(sql);
								System.out.println("enetr y/n");
								decider=sc.next();
								
							}while("y".equals(decider));
						}
								catch(SQLException ex)
							{
								System.out.println(ex);
								
							}
							finally
							{
								Manager3.closeAll(null, st, con);
								
							}
							
}
}