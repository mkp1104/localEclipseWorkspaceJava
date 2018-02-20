package com.lara;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class O
{
public static void main(String[] args) 
{
String s1="abcdefc";
String s2="c";
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
System.out.println(mt.start());	
}
}
}