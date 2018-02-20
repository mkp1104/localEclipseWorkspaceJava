package com.lara.annotations;
@interface M
{
public boolean flag();
public String Message();
}
@M(Message="some info")
class K
	{
		public static void main(String[] args) 
		{
			System.out.println("Hello World!");
	}
}