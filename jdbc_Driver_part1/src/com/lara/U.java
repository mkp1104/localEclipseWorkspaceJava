package com.lara;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.ResultSet;

public class U {

	public static void main(String args[]) throws Exception
	{
		Statement st=EUtil.getStatement();
		Scanner sc=new Scanner(System.in);
		ResultSet rs=null;
		String key,sql,check;
		do
		{
			System.out.println("enter search key...");
			key=sc.next();
			sql="select * from employees where Fname like '%"+key+"%' or Lname like '%"+key+"%'"; 
			rs=st.executeQuery(sql);
			boolean flag=true;
			while(rs.next())
			{
				if(flag)
				{
					flag=false;
				}
			
				System.out.print(rs.getInt("id"));
				System.out.print(","+rs.getString(2));
				System.out.print(","+rs.getString(3));
				System.out.println(","+rs.getInt(4));
				
			}	
			
			if(flag)
			{
				System.out.println("No record found");
			}
			System.out.println("Want to search again y/n ?");
			check=sc.next();
		}while("y".equals(check));
System.out.println("Thank for Searching..Visit again !!!");

			
		}	
	}

