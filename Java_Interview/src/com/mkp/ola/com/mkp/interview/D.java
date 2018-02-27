package com.mkp.interview;

class D implements Comparable
{
	int i;
	D(int i)
	{
	this.i=i;
	}
	public int hashCode()
	{	
	return Integer.toString(i).hashCode();	
	}
	public int compareTo(Object obj)
	{
		return i-((D)obj).i;
		
	}
	public boolean equals(Object obj)
	{
		return i==((D)obj).i;
		
	}
	public String toString()
	{
		return "(i="+i+")";
		
	}
}

		

