
package com.lara;

public class L
{
public static void main(String[] args) 
{
String s1="abc;xyz;hello;123";
//String x[]=s1.split(';');//return type of split() is  Array String!!!
//char x[]=s1.split(";");//return type of split() is  Array String!!!
String x[]=s1.split(";");//return type of split() is  Array String!!!
//int y=s1.split(";");
//int j[]=s1.split(";");
//String k=s1.split(";");

for(String s:x)
{
System.out.println(s);	
}

}
}
