package com.lara.annotations; 

@interface F
{
public String someMessage();
}
class G
	{
	@F(someMessage="My First Method")
		
	
	public static void main(String[] args) 
		{
		System.out.println("Hello World!");
	}
}
