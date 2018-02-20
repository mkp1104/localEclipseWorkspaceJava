package com.lara;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Q
{
public static void main(String[] args) 
{
String s1="sddsabcdefc";
String s2="abc";
Pattern pt=Pattern.compile(s2);
System.out.println("pt:"+pt);
Matcher mt=pt.matcher(s1);
System.out.println("mt:"+mt);
//System.out.println("mt.find():"+mt.find());
//System.out.println("mt.find():"+mt.find());
//System.out.println("mt.start():"+mt.start());
//System.out.println("mt.start():"+mt.start());
while(mt.find())
{
System.out.println(mt.group());	//printing the content of pt.which is s2!
System.out.println(s2);	
System.out.println(pt);	//content of s2
System.out.println("@");
System.out.println(mt.start());	//return index of s2 in s1!!

}
}
}