package com.lara;
import java.util.HashMap;
import java.util.TreeMap;
class A
{
int i;
A(int i)
{
this.i=i;	
}
public String toString()
{
	return "(i="+i+")";
}
}
public class Manager4{
public static void main(String args[])
{
TreeMap map=new TreeMap();
map.put(new A(9),"abc");
map.put(new A(90),"abc1");
map.put(new A(5),"abc2");
System.out.println(map);
}
}
