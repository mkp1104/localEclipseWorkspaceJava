package com.lara;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;

public class Manager1 {

	public static void main(String args[])  throws Exception
	{
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection	con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","system123");
	Statement st=con.createStatement();
		String s1="create table tab3(sno int,name varchar(9),age int)";
		st.executeUpdate(s1);
		System.out.println("done");
		
		
	}
}
