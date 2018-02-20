
package com.lara;

public class U
{
public static void main(String[] args) 
{
String s1="abc hello xyz abc";
//String s2=s1.replaceAll('a',"test");
String s2=s1.replaceAll("abc","test");
//String s3=s1.replace("abc",'t');
String s3=s1.replace("abc","test");
String s4=s1.replaceFirst("abc","test");
System.out.println(s1);
System.out.println(s2);
System.out.println(s3);
System.out.println(s4);


}
}
