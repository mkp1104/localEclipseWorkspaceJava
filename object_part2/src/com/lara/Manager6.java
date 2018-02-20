package com.lara;
class G
{
	int i,j;
	G(int i,int j)
	{
	this.i=i;
	this.j=j;
	}

	public boolean equals(Object obj)
	{
		G myObj=(G)obj;
	return i==myObj.i && j==myObj.j;
	}
}
public class Manager6
{

	public static void main(String[] args) 
	{
		G g1=new G(1,2);
		G g2=new G(1,3);	
		System.out.println(g1.equals(g2)); 
	}
}