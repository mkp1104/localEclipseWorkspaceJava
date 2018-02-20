package com.lara;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
public class Z1 {
	public static void main(String args[]) throws Exception
	{
	Statement st=EUtil.getStatement();
	String s1="select * from employees";
	ResultSet rs=st.executeQuery(s1);
	ResultSetMetaData rsmt=rs.getMetaData();
	String value,name;
	int number;
	number=rsmt.getColumnCount();
	while(rs.next())
	{
		
	for(int i=1;i<=number;i++)
	{
		name=rsmt.getColumnName(i);
		value=rs.getString(i);
		System.out.print(name+":"+value+",");	
	}
	System.out.println();
	}
}
}
