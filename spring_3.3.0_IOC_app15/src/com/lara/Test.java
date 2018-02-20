package com.lara;

public class Test 
{
private String 	par1;
private int par2;
Test(String arg0,int arg1)
{
	System.out.println("String,Int");
	par1=arg0;
	par2=arg1;
}
Test(int arg1,String arg0)
{
	System.out.println("Int,String");
	par1=arg0;
	par2=arg1;
}
public String getPar1() {
	System.out.println("Set:parameter");
	return par1;
}
public int getPar2() {
	return par2;
}

}
