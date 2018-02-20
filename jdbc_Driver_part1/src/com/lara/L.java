package com.lara;
import java.sql.ResultSet;
import java.sql.Statement;
public class L {

	public static void main(String args[]) throws Exception
	{
		Statement st=EUtil.getStatement();
		String s1="select * from employees";
		ResultSet rs=st.executeQuery(s1);
//		ResultSet rs=st.executeQuery(s1);
		while(rs.next())
		{
			System.out.println(rs.getInt("id"));//starting index start from 1
			System.out.println(rs.getString("Fname"));
			System.out.println(rs.getString("Lname"));
		}	System.out.println(rs.getInt("age"));
		
	}
}