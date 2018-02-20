package com.lara;


import java.sql.Statement;
import java.io.FileReader;
import java.io.BufferedReader;
public class I
{
	public static void main(String[] args) throws Exception 
	{
		String sql=null;
		Statement st=EUtil.getStatement();
		FileReader fin=new FileReader("test1.txt");
		BufferedReader bin=new BufferedReader(fin);

		String row=bin.readLine();
		String cols[];
		while(row!=null)
		{
		cols=row.split(",");
		sql="insert into employees values("+cols[0].trim()+",'"+cols[1].trim()+"','"+cols[2].trim()+"',"+cols[3].trim()+")";
		st.execute(sql);
		row=bin.readLine();
		}
		System.out.println("Thank you Sir,Please visit Again!!!!!!!!!!");
	}
}