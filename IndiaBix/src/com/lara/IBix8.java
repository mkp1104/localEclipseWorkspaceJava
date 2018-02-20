package com.lara;

public class IBix8 
	
{
	public static void main (String [] args) 
    {
        String s1="abc";

		Object o = new Object() /* Line 5 */
        {
            public boolean equals(Object obj) 
            {
                return true;
            } 
        }  ;    /* Line 11 */
        
        System.out.println(o.equals("Fred"));
        System.out.println(o.equals(3));
        System.out.println(s1.equals(3));
    }
}
