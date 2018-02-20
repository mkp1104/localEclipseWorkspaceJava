package com.lara;

public class Test 
{
public static void main(String[] args) 
{
	try
	{
int i=10/0;	

	}
catch(ArithmeticException e)
{
e.printStackTrace();	
}
System.out.println("try 1");
try {
int y=10/0;	
}

catch (ArithmeticException e) 
{
	e.printStackTrace();	


}
System.out.println("try 2");
}
}
