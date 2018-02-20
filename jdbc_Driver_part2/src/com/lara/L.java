package com.lara;
import java.sql.Connection;
import java.io.FileReader;
import java.io.BufferedReader;
import java.sql.SQLException;
import java.io.IOException;
import java.sql.Statement;
public class L {
		public static void main(String args[]) 
		{
			Connection con=null;
			Statement st=null;
			FileReader fin=null;
			BufferedReader bin=null;
			try
			{
			 con=FUtil.getConnection();
			 st=con.createStatement();
			 fin=new FileReader("text.txt");
			 bin=new BufferedReader(fin);
			
			 String sql=null;
			 int status=0;
			 String row=bin.readLine();
			 while(row!=null)
			 {
				 sql=composeSQL(row);
				 status+=st.executeUpdate(sql);
				 row=bin.readLine();
				 
			 }
			 System.out.println(status);
			}
			
			catch(IOException ex)
			{
				System.out.println(ex);
				
			}
			catch(SQLException ex)
			{
				System.out.println(ex);
			}
			
			finally
			{
				try{
				if(bin!=null)
				{
					bin.close();
					bin=null;
					
				}
				}
				catch(IOException ex)
						{
					ex.printStackTrace();
					
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
			
				FUtil.closeConnection(con);
				FUtil.closeStatement(st);
			}
		}
		
		private static String composeSQL(String row)
		{
			int i=row.indexOf("-");
			String name=row.substring(0,i);
			String age=row.substring(i+1,row.length());
			String sql="insert into tab2 values(tab2_sequence.nextval,'"+name+"',"+age+")";
			return sql;
			
		}
}