package com.lara;
import java.util.ArrayList;
import java.util.Collections;
public class Manager8
{
	public static void main(String[] args) 
	{
		ArrayList list1=new ArrayList();
		list1.ensureCapacity(100);
		System.out.println(list1);
		list1.add(90);
		list1.add(0);
		list1.add(9);
		list1.add(9);
		list1.add(9);
		list1.add(9);
		list1.add(4);
		list1.add(5);
		System.out.println(list1);
		boolean b=list1.contains(9);
		System.out.println(b);
//		ArrayList list3=new ArrayList(1,2,3);
		ArrayList list3=new ArrayList();
		list3.add(0);
		list3.add(9);
		list3.add(4);
		list3.add(11);
		
		boolean b1=list1.containsAll(list3);
		System.out.println(b1);
		boolean b3=list1.isEmpty();
		System.out.println(b3);
		System.out.println(list1.lastIndexOf(9));
		System.out.println(list1.lastIndexOf(10));
		boolean b4=list1.retainAll(list3);
		System.out.println(b4);
		list1.trimToSize();
		System.out.println(list1);
	//	Collections.
		}
	}
/*ArrayList-->Methods-->add(),add(index,value),size(),get(index),iterator(),listiterator(),removeAll(Collection c),remove(index),remove(value),addAll(),set(index,value)
 * Collections-->Methods-->sort(),binarySearch(),max(),min();
 * C
 * 
 * 
 *
 * */
