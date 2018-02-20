
package com.lara;
class test 
{
	String g;
	public static void main(String[] args) 
	{
		int i=9;
		int j=9;
		String s1="abc";
		String s2="abcdf";
		String s3=new String("abc");
		test t=new test();
		test t1=new test();
		t.g="abc";
		t1.g="abc";
		//System.out.println(i.hashCode());
		//System.out.println(j.hashCode());
		System.out.println(s1.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(t.hashCode());
		System.out.println(t1.hashCode());
	}
}
