package com.lara;

interface D1
{
void abc();
}
public class Test implements D1
{
	public void abc()
	{
		
		System.out.println("abc");
	}
	public static void main(String[] args)
	{
	Test t=new Test();
	t.abc();
	}

}
