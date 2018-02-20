package com.lara;

import java.util.Locale;

public class String_all_methods 
{
public static void main(String[] args) {
	

	String s=new String("abc");
	StringBuffer sb=new StringBuffer("abc");
	System.out.println(s.charAt(1));
			System.out.println(s.codePointAt(1));
			System.out.println(s.codePointBefore(1));
			System.out.println(s.codePointCount(1, 3));
			System.out.println(s.compareTo("xyz"));
			System.out.println(s.compareToIgnoreCase("ABC"));
			System.out.println(s.concat("xyz"));
			System.out.println(s.contains("asas"));
			System.out.println(s.contentEquals("abc"));
			System.out.println(s.contentEquals(sb));
			System.out.println(s.endsWith("c"));
			System.out.println(s.equals("abc"));
			System.out.println(s.equalsIgnoreCase("ABC"));
			System.out.println(s.hashCode());
			System.out.println(s.indexOf(2));
			System.out.println(s.indexOf("ab"));
			System.out.println(s.intern());
			System.out.println(s.isEmpty());
			System.out.println(s.lastIndexOf('c'));
			System.out.println(s.lastIndexOf("ab"));
			System.out.println(s.lastIndexOf("b", 2));
			System.out.println(s.lastIndexOf('b', 2));
			System.out.println(s.length());
			System.out.println(s.matches("//d"));
			s.notify();
			s.notifyAll();
			System.out.println(s.offsetByCodePoints(0, 3));
			System.out.println(s.regionMatches(0, s, 0, 0));
			System.out.println(s.regionMatches(false, 0, s, 0, 0));
			System.out.println(s.replace('c', 'b'));
			System.out.println(s.replace("abc", "cba"));
			System.out.println(s.replaceAll("//d", "a"));
			System.out.println(s.replaceFirst("//d", "cb"));
			System.out.println(s.startsWith("a"));
			System.out.println(s.startsWith(s, 3));
			System.out.println(s.substring(3));
			System.out.println(s.substring(1, 3));
			System.out.println(s.split("//s"));
			System.out.println(s.split("//d",2));
			System.out.println(s.subSequence(1, 2));
			System.out.println(s.toCharArray());
			System.out.println(s.toLowerCase());
			System.out.println(s.toLowerCase(Locale.ENGLISH));
			System.out.println(s.toString());
			System.out.println(s.toUpperCase());
			System.out.println(s.toUpperCase(Locale.CHINESE));
			System.out.println(s.trim());
			System.out.println(s.valueOf(true));
			System.out.println(s.valueOf('a'));
			System.out.println(s.valueOf("abc"));
			System.out.println(s.valueOf(12.43));
			System.out.println(s.valueOf(12.12));
			System.out.println(s.valueOf(12));
			System.out.println(s.valueOf(313131313));
			System.out.println(s.valueOf(10));
	//		System.out.println(s.valueOf(data, offset, count)
			try
			{
			s.wait();
			s.wait(12121);
			s.wait(231, 323232);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();	
			}
			System.out.println(s.CASE_INSENSITIVE_ORDER);
			s.getBytes(0, 0, null, 0);
			s.getChars(0, 1, null, 0);
			
}
}
