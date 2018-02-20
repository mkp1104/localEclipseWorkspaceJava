
package com.lara;

public class W
{
public static void main(String[] args) 
{
	String s1="abc";
	String s2="abc";
String s3=new String("abc");
String s4=new String("abc");
System.out.println("1:"+(s1==s2));
System.out.println("2:"+s1.equals(s2));

System.out.println("3:"+(s2==s3));

System.out.println("4:"+s2.equals(s3));

System.out.println("5:"+(s3==s4));

System.out.println("6:"+s3.equals(s4));

System.out.println("7:"+(s4==s1));

System.out.println("8:"+s3.equals(s4));

}
}
