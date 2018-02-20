package com.lara;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.Statement;
	public class EUtil
	{
		public static Statement getStatement() throws Exception
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection con=DriverManager.getConnection("jdbc:odbc:db-dsn","system","system123");
			Statement st=con.createStatement();
			return st;
		}
	}