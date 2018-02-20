package com.lara;

public class G 
{
public static void main(String[] args) 
{
StringBuffer sb=new StringBuffer();
System.out.println(sb.length());
System.out.println(sb.capacity());
sb.append("1121321212");
//sb.append(1121321212);
System.out.println(sb.length());
System.out.println(sb.capacity());

}
}
