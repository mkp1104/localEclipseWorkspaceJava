package com.lara;
import java.sql.ResultSet;
import java.sql.Statement;
public class W {
	public static void main(String args[]) throws Exception
	{
	Statement st=EUtil.getStatement();
	String s1="select Fname as First_Name from employees";
	ResultSet rs=st.executeQuery(s1);
	while(rs.next())
	{
	//	System.out.println(rs.getString("First_Name"));	
		System.out.println(rs.getString("Fname"));	
		
	}

}
}
