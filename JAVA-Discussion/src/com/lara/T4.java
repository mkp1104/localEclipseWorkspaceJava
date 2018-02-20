package com.lara;
import java.util.*;
public class T4 
{
		public final static void main(String args[]){
		List list= new ArrayList();
		list.add("vivek");
		list.add("kumar");
		Iterator i =list.iterator();
		while(i.hasNext()){
		System.out.println(i.next());//on next time it will give error!!
		list.add("abhishek");
		System.out.println(list);
		}
		}
}
