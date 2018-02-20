package com.lara;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import com.sun.org.apache.xalan.internal.xsltc.util.IntegerArray;
public class Manager1
{
	public static void main(String[] args) 
	{
		
		Collection c = new ArrayList();
		List l = new ArrayList();
//		List<Object> nl = new ArrayList<String>();
		List<String> ml = new ArrayList<String>();
		ArrayList list=new ArrayList();//list is just like Container...
		list.add(90);
		list.add(9.9);
		list.add("abc");
		list.add(true);
//		list.
		String [] x = new String []{"abc","xyz","mkp"};
//		x.Arrays.asList;
		List<String> m2  = Arrays.asList(x);
//		System.out.println(m2);
		for (String is : m2) {
			System.out.println(is);
		}
		
		System.out.println(list);//printing all the values of Container...
	}
}
