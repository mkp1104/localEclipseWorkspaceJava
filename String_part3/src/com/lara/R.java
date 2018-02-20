package com.lara;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class R
{
public static void find(String s1,String s2) 
{
	
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
System.out.println(mt.group());	
System.out.println(s2);	
System.out.println(pt);	
System.out.println("@");
System.out.println(mt.start());	

}
}
}