package com.lara;
import java.util.Hashtable;

public class Manager38
{
	public static void main(String[] args) 
	{
	    Hashtable  tab=new Hashtable();
	    tab.put(null, "abc");
	    tab.put("test", null);
	    System.out.println(tab);
	}
}