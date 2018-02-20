package com.lara;
class  U1
{
int i;
U1(int i)
	{
		this.i=i;
	}
	public String toString()
	{
	return "i="+i;
	}
	public boolean equals(Object obj)
	{
	return ( i==((U1)obj).i);
	}
	public int hashCode()
	{
	return i;
	}

}
public class  Manager13
{

	public static void main(String[] args) 
	{
		U1 u1=new U1(90);
		U1 u2=new U1(90);
		System.out.println(u1);
		System.out.println(u2);
		System.out.println(u1.equals(u2));
		System.out.println(u1.hashCode());
		System.out.println(u2.hashCode());
	}
}