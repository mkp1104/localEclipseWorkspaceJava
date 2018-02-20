package com.lara;
public class X1
{
	public static void main(String[] args) 
	{
		String x=new String();//here object is creating.
		String p=null;//here no Object is created. 
		String q="mkp";//here also object is creating..
		System.out.println("x="+x);//calling to string method of string class.
		System.out.println(x.toString());//calling to string method of String class.
		System.out.println(p);
//	System.out.println(p.toString()); it will give NullPointer exception..
		System.out.println(q);
		System.out.println(q.toString());

		}
}
