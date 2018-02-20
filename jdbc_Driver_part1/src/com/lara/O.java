package com.lara;
import java.sql.Statement;
import java.sql.ResultSet;
public class O {
	public static void main(String args[]) throws Exception
	{
		Statement st=EUtil.getStatement();
		String s1="select * from Employees";
		ResultSet rs=st.executeQuery(s1);
		while(rs.next())
		{
			System.out.print(rs.getInt(1));
			System.out.print(","+rs.getString(2));
			System.out.print(","+rs.getString(3));
			System.out.println(","+rs.getInt(4));
			
		}
		System.out.println("Thank You Sir,Please Vist Again !!!!");
	}

}
