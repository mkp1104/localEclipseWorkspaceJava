package com.lara;

public class Test2
{
	public static void main(String[] args) {
	
		String s="abc";
		String s0="abc";
		String s1=new String("abc");
		String s2=new String("abc");
		System.out.println("1");
		if(s1==s2)//Object class's equals m() is calling here!!
		{
			System.out.println("2");
			
		}
		System.out.println(s1.equals(s2));//String class's equals m() is calling here!!
		if(s==s0)//Object class's equals m() is calling here!!
		{
			System.out.println("3");
		
		}
		System.out.println(s.equals(s0));//String class's equals m() is calling here!!
	}
	}