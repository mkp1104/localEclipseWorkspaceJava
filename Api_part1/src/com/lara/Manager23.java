package com.lara;
import java.util.ArrayList;
import java.util.Collections;
class C
{
int i;
C(int i)
{
this.i=i;	
}
public String toString()
{
return "i="+i;	
}
}
public class Manager23
{
	public static void main(String[] args) 
	{
		ArrayList list1=new ArrayList();
		list1.add(new C(9));
		list1.add(new C(19));
		list1.add(new C(4));
		list1.add(new C(10));
		list1.add(new C(8));
		System.out.println(list1);
		Collections.sort(list1);
		System.out.println(list1);
		}
	}