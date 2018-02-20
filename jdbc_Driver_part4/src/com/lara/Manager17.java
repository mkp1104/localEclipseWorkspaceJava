package com.lara;
import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.io.IOException;

public class Manager17 
{
public static void main(String arg[])
{
						Connection con=null;
						PreparedStatement pst=null;
						try
						{
							con=Manager3.getConnection();
							pst=con.prepareStatement("insert into tab4 values(?,?)");
							FileReader fin=null;
							BufferedReader bin=null;
							try
							{
								fin=new FileReader("data.txt");
								bin=new BufferedReader(fin);
								String sno,name,line;
								int index;
								line=bin.readLine();
								while(line!=null)
								{
									index=line.indexOf("-");
								
									sno=line.substring(0,index);
									name=line.substring(index+1, line.length());
									pst.setInt(1, Integer.parseInt(sno));
									pst.setString(2, name);
									pst.executeUpdate();
									line=bin.readLine();
								}
							}
							catch(IOException ex)
							{
								System.out.println(ex);
								
							}
						
							finally
							{
								
								try
								{
									if(bin!=null)
									{
										bin.close();
										bin=null;
									}
									
								}
								catch(IOException ex)
								{
									System.out.println(ex);
								}

								try
								{
									if(fin!=null)
									{
										fin.close();
										fin=null;
									}
									
								}
								catch(IOException ex)
								{
									System.out.println(ex);
								}
								
							}
						}
						catch(SQLException ex)
						{
							
						System.out.println(ex);
						}
						finally
						{
									Manager3.closeAll(null, pst, con);
								
							}
						System.out.println("done");
}	

}