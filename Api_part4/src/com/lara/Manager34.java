package com.lara;
import java.util.TreeSet;
import java.util.HashMap;
public class Manager34
{
	public static void main(String[] args) 
	{
	    HashMap map1=new HashMap();
	    map1.put(null,null);//same key value will be replaced with latest one...
	    map1.put(null,"abc");
	    map1.put(null,null);
	    map1.put(null,"xyz");
		System.out.println(map1);
	}
}

		

