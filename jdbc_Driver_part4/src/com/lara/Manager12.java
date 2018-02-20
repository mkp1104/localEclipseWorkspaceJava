package com.lara;
import java.sql.Connection;
import java.util.Scanner;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Manager12 {
public static void main(String arg[])
{						Scanner sc=new Scanner(System.in);
						Connection con=null;
						PreparedStatement pst=null;
						String sno,name,decider,age;
						try
						{
							con=Manager3.getConnection();
							pst=con.prepareStatement("insert into tab3 values(?,?,?)");
							do{
								System.out.println("enter sno");
								sno=sc.next();
							pst.setInt(1, Integer.parseInt(sno));
							
								System.out.println("enter name");
								name=sc.next();
							pst.setString(2,name);
								System.out.println("enter age");
								age=sc.next();
								pst.setInt(3, Integer.parseInt(age));
								pst.executeUpdate();
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
								Manager3.closeAll(null, pst, con);
								
							}
							
}
}