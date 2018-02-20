package com.lara;
class  V1
{
int i,j;
V1(int i,int j)
	{
		this.i=i;
		this.j=j;
	}
	public String toString()
	{
	return "i="+i+  ",j="+j;
	}
	public boolean equals(Object obj)
	{
	return (obj instanceof V1 && i==((V1)obj).i &&j==((V1)obj).j);
	}
	public int hashCode()
	{
		String s1=Integer.toString(i);
		String s2=Integer.toString(j);
		int hash=s1.hashCode();
		hash+=s2.hashCode();
		return hash;
	}
}
public class  Manager14

{

	public static void main(String args[]) 
	{
		V1 v1=new V1(10,40);
		V1 v2=new V1(40,10);
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v1.equals(v2));
		System.out.println(v1.hashCode());
		System.out.println(v2.hashCode());
	}
}