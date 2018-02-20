package com.lara;
import java.util.StringTokenizer;
public class C
{
public static void main(String[] args) 
{
String s1="abc12103469hello123";
String s2="[0-9]";
StringTokenizer st=new StringTokenizer(s1,s2);
while(st.hasMoreElements())
{

System.out.println(st.nextElement());

}
}
}
