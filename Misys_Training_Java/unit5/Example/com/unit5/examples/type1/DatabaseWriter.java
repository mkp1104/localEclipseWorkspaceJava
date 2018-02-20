package com.unit5.examples.type1;
class Connection
{
	public void connectToOracle()
	{
		System.out.println("Connecting to oracle");
	}
}

class Connection
{
	public void connectToSybase()
	{
		System.out.println("Connecting to sybase");
	}
}

class DatabaseWriter 
{
	public static void main(String[] args) 
	{
		Connection con = new Connection();
		con.connectToOracle();
	}
}
