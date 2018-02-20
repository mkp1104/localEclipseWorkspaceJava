package com.lara;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class B {

	public static void main(String args[])
	{
		Connection con=null;
		Statement st=null;
		try
		{
			con=AUtil.getConnection();
			st=con.createStatement();
			String s1="insert into tab2 values(tab2_sequence.nextval,'xyz',33)";
			int i=st.executeUpdate(s1);
			System.out.println(i);
		}
		catch(SQLException ex)
		{
			System.out.println(ex);
		}
		finally
		{
			AUtil.closeStatement(st);
			AUtil.closeConnection(con);
			
			
		}
		
	}
}
