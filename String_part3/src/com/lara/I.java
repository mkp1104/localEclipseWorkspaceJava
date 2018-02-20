package com.lara;

public class I 
{
public static void main(String[] args) 
{
StringBuffer sb=new StringBuffer(500);
System.out.println(sb.length());
System.out.println(sb.capacity());
sb.append("953593858");
System.out.println(sb.length());
System.out.println(sb.capacity());
sb.trimToSize();
System.out.println(sb.length());
System.out.println(sb.capacity());


}	

}
