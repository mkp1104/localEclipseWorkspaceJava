package com.lara;
class  U
{
int i;
U(int i)
	{
		this.i=i;
	}
	public String toString()
	{
	return "i="+i;
	}
	public boolean equals(Object obj)
	{
	return (obj instanceof U && i==((U)obj).i);
	}
}
public class  Manager131
{

	public static void main(String[] args) 
	{
		U u1=new U(90);
		U u2=new U(90);
		System.out.println(u1);
		System.out.println(u2);
		System.out.println(u1.equals(u2));
		System.out.println(u1.hashCode());//both will return 2 different integer no...
		System.out.println(u2.hashCode());
	}
}