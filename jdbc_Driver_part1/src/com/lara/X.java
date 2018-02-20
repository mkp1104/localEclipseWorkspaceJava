package com.lara;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
public class X {
	public static void main(String args[]) throws Exception
	{
	Statement st=EUtil.getStatement();
	String s1="select * from employees";
	ResultSet rs=st.executeQuery(s1);
	ResultSetMetaData rsmt=rs.getMetaData();
	int c1=rsmt.getColumnCount();
	String c2=rsmt.getColumnName(1);
	String c3=rsmt.getColumnName(2);
	String c4=rsmt.getColumnName(3);
	String c5=rsmt.getColumnName(4);
	System.out.println(c2);
	System.out.println(c3);
	System.out.println(c4);
	System.out.println(c5);
	System.out.println("total no of column:"+c1);
}
}
