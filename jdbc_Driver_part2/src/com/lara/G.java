package com.lara;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
public class G {
		public static void main(String args[]) 
		{
			Connection con=null;
			Statement st=null;
			ResultSet rs=null;
			try{
			 con=FUtil.getConnection();
			 st=con.createStatement();
			 String s1="select * from employees";
				rs=st.executeQuery(s1);			
				while(rs.next())
				{
					System.out.print(rs.getInt(1)+"-");
					System.out.print(rs.getString(2)+"-");
					System.out.print(rs.getString(3)+"-");
					System.out.print(rs.getInt(4));
					System.out.println();
				}
			}
			catch(SQLException ex)
			{
				System.out.println(ex);
			}
			finally
			{
				FUtil.closeStatement(st);
				FUtil.closeConnection(con);
			}
		}
}			
		