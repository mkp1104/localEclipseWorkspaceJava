package com.lara;

public class F 
{
public static void main(String[] args) 
{
StringBuffer sb=new StringBuffer();	
//StringBuffer sb=new StringBuffer(121);	
//StringBuffer sb=new StringBuffer("xyz");	
sb.append("abc");
//sb.append("abc");
System.out.println(sb.capacity());
System.out.println(sb.length());

}
}
