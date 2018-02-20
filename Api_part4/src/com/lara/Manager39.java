package com.lara;
import java.util.HashMap;
import java.util.Hashtable;
class P
{
int i;
P(int i)
{
this.i=i;	
}

public String toString()
{
return "(i+"+i+")";	
}
}
class Q
{
int i;
Q(int i)
{
this.i=i;

}

public String toString()
{
return "(i="+i+")";	
}
public int hashCode()
{
	return Integer.toString(i).hashCode();
}
public boolean equals(Object obj)
{
return (obj instanceof Q && i==((Q)obj).i);	
}
}
public class Manager39
{
	public static void main(String[] args) 
	{
	    HashMap  tab=new HashMap();
	    tab.put(90, "e1");
	    tab.put(90, "e2");
	    tab.put("abc", "v1");
	    tab.put("abc", "v2");
	    tab.put(new P(9), "hello1");
	    tab.put(new P(9), "hello2");
	    tab.put(new Q(9),"hello3");
	    tab.put(new Q(9), "hello4");
	    tab.put(new StringBuffer("abc"),"hello5");
	    tab.put(new StringBuffer("abc"),"hello6");
	    System.out.println(tab);
	}
}

		

