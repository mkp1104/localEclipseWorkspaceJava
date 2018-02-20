package com.lara;
import java.sql.ResultSet;
import java.sql.Statement;
public class V {
	public static void main(String args[]) throws Exception
	{
	Statement st=EUtil.getStatement();
	String s1="select * from employees";
	ResultSet rs=st.executeQuery(s1);
	while(rs.next())
	{
		System.out.println(rs.getInt(1));
		System.out.println(rs.getString(2));

	//	System.out.println(rs.getInt("ID"));
	//	System.out.println(rs.getString(1));		
	}

}
}
