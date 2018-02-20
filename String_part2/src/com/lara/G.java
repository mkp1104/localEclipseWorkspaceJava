
package com.lara;

public class G
{
public static void main(String[] args) 
{
 String s1="ab ab ab ab";
 String s3="10987654321";
 String s2="012345678910";

int i=s1.indexOf('b',5);
int j=s1.indexOf('a',7);
int j1=s1.lastIndexOf('a',7);
int k=s1.indexOf('a');
int k1=s1.lastIndexOf('b',7);
System.out.println(i);
System.out.println(j);
System.out.println(j1);
System.out.println(k);
System.out.println(k1);
}
}
