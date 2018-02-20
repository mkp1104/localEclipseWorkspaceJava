package com.lara;

class Q
{}
class P 
{
	
}
/*class D
 * {
 * 
 * }
 * Class E extends D
 * {
 * 
 * }
 * */
public class Test
{	
	
	
	public static void main(String[] args) 
	{

		Object obj=new Object();
		P e=new P();
		Q d=new Q();
		
		
	//	obj=e;
		obj=d;
	//	P p1=(P)obj;
		P e1=(P)obj;
		System.out.println("done");
	}
}
