package com.lara;
class P1
{
int p=10;	
}
class Q1 extends P1
{
	String q5="q1";
}
public class Test 
{

public static void main(String[] args) 
{
	P1 p=new P1();
	Q1 q=new Q1();
	Object obj=q;
//	Q1 q1=(Q1)obj;
//	Q1 q3=(Q1)p;
	P1 p6=(P1)q;
	P1 p4=(P1)obj;
//System.out.println(q1);	
}
}
