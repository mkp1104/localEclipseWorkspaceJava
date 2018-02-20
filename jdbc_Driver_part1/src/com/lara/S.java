package com.lara;
import java.sql.ResultSet;
import java.sql.Statement;
public class S {

	public static void main(String args[]) throws Exception
	{
		Statement st=EUtil.getStatement();
		String s1="select * from employees";
		ResultSet rs=st.executeQuery(s1);
		boolean flag=true;
		while(rs.next())
		{
			if(flag)
			{
				flag=false;
			}
				System.out.print(rs.getInt(1));
				System.out.print(","+rs.getString(2));
				System.out.print(","+rs.getString(3));
				System.out.println(","+rs.getInt(4));
			
		}
		
		if(flag)
		{
			System.out.println("No record Fonud Sir...");

			
		}
		System.out.println("Thank you sir,Please Visit Again ..!!!!");

		
	}
}
