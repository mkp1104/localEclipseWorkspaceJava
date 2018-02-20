package com.lara;
import java.util.Arrays;
 class D1 implements Comparable
{
	int i;
	D1(int i)
	{
	this.i=i;
	}
	/*public String toString()
	{								It can work and it will print reff variable only. 
	return "i="+i;
	}*/
	
	
	
	public int compareTo(Object obj)//internally using bubble short for shorting purpuse on each object sequencely .there is 6 object in which there is compareTo method is Available in which Object arg is empty provide that value and compare with every one....
	{
//	D1 d1=(D1)obj;//this code is not available in original compareTo m() of Arrays class..so gives error if not override that one.
	return i-((D1)obj).i;
	}
	
	
}  
public class Manager4
{
	public static void main(String[] args) 
	{
		D1[]x={
		new D1(9),
		new D1(90),
		new D1(19),
		new D1(29),
		new D1(13),
		new D1(33)};

		System.out.println(Arrays.toString(x));
		Arrays.sort(x);
		System.out.println(Arrays.toString(x));
	}
}
