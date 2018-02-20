package com.lara;
import java.util.Iterator;
import java.util.HashSet;
class G
{
int i,j;
G(int i,int j)
{
this.i=i;
this.j=j;
}
public String toString()
{
return "i="+i+",j="+j+",";	
}
public int hashCode()
{
	System.out.println("hashCode");
	String s1=Integer.toString(i);
	String s2=Integer.toString(j);
	int hash=s1.hashCode();
	hash+=s2.hashCode();
	return hash;
}
public boolean equals(Object obj)
{
	System.out.println("equals");
	return (obj instanceof G && i==((G)obj).i&&j==((G)obj).j);
}
}
public class Manager21 {
	public static void main(String args[])
	{
		HashSet set=new HashSet();
	set.add(new G(1,1));
	set.add(new G(1,1));
	set.add(new G(2,1));
	set.add(new G(1,2));
	System.out.println(set.size());
	System.out.println(set);
	}
}