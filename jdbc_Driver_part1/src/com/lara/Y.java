package com.lara;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
public class Y {
	public static void main(String args[]) throws Exception
	{
	Statement st=EUtil.getStatement();
	String s1="select * from person";
	ResultSet rs=st.executeQuery(s1);
	ResultSetMetaData rsmt=rs.getMetaData();
	int c1=rsmt.getColumnCount();
	for(int i=1;i<=c1;i++)
	{
		System.out.println(rsmt.getColumnName(i));	
	}
	System.out.println(c1);
}
}
