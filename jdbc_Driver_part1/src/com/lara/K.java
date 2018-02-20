package com.lara;
import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Statement;
import java.util.Arrays;
public class K {
	public static void main(String args[]) throws Exception
	{
		Statement st=EUtil.getStatement();
		FileReader fin=new FileReader("test3.txt");
		BufferedReader bin=new BufferedReader(fin);
		String cols[],row, sql;
		row=bin.readLine();
		while(row!=null)
		{
cols=row.split("\\|");
			sql="insert into employees values("+cols[0].trim()+",'"+cols[1].trim()+"','"+cols[2].trim()+"',"+cols[3].trim()+")";
			st.executeUpdate(sql);
			row=bin.readLine();
		}
		System.out.println("Thank You Sir,Please Visit Again!!!!!!!!");
		
	}
}