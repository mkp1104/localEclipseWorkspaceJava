package com.lara;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
public class Z {
	public static void main(String args[]) throws Exception
	{
	Statement st=EUtil.getStatement();
	String s1="select * from employees";
	ResultSet rs=st.executeQuery(s1);
	ResultSetMetaData rsmt=rs.getMetaData();
	int c1=rsmt.getColumnCount();
	while(rs.next())
	{
	for(int i=1;i<=c1;i++)
	{
		System.out.print(rs.getString(i)+",");	
	}
	System.out.println();
	}
	System.out.println(c1);
}
}
