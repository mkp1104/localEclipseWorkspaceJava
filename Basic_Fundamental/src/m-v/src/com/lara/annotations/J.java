package com.lara.annotations;
@interface Test
{
public boolean flag();
public String Message();
}
@Test(Message="some info",flag=true)
class J
	{
		@Test(Message="some info",flag=true)
		int m;
		@Test(Message="some info",flag=true)
		J()
		{}
		@Test(Message="some info",flag=true)
		public static void main(String[] args) 
		{
			System.out.println("Hello World!");
	}
}