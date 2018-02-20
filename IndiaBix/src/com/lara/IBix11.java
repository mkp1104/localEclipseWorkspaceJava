package com.lara;
import java.util.*; 
public class IBix11 
{
	   
	
	
	    public static void main (String[] args) 
	    { 
	        Object x = new Vector().elements(); 
	        System.out.print((x instanceof Enumeration)+","); 
	        System.out.print((x instanceof Iterator)+","); 
	        System.out.print(x instanceof ListIterator); 
	    } 
	}

