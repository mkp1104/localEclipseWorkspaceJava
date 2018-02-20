package com.lara;
import java.util.HashMap;
import java.util.TreeMap;
class B implements Comparable
{
int i;
String s;
B(int i)
{
this.i=i;	
}
B(String  s1)
{
this.s=s1;	
}
public String toString()
{
	return "(i="+i+")";
}
public int compareTo(Object obj)
{
return i-((B)obj).i;	
}
}

public class Manager5{
public static void main(String args[])
{
TreeMap map=new TreeMap();
map.put(new B(9),"abc");
map.put(new B(91),"abc1");
map.put(new B(19),"abc2");
map.put(new B(5),"abc3");
System.out.println(map);
}
}
