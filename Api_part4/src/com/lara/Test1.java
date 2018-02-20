package com.lara;

public class Test1
{
	public static void main(String[] args) {
	
		
		int i=new Integer(10);
		int j=new Integer(10);
		
		String s1=Integer.toString(10);
		String s2=Integer.toString(10);
		//System.out.println(i.toString()); Error!! on premitive You Can't call toString() Or equals()!!!
		//System.out.println(j.toString()); Error!!
//		System.out.println(i.equals(j)); Error!!
//		System.out.println(j.equals(i)); Error!!
		System.out.println(new Integer(10).equals(new Integer(10)));
		System.out.println(new Integer(10).toString());
		System.out.println(s1);
		System.out.println(s2);
		System.out.println("done");
	
	}
	}