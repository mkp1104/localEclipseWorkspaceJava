package com.lara;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.TreeSet;
import java.util.Vector;

public class AllinOne 
{
public static void main(String[] args)
{
	

int []x=new int[10];
//x={1,2,3,4};
x[0]=5;
x[1]=4;
x[3]=7;
x[4]=9;
x[5]=0;
x[6]=2;
x[7]=8;
System.out.println(Arrays.toString(x));
Arrays.sort(x, 2,6);//sorting for perticular index range excluding ending index (here which is 6),having all data type int,double,float,char,object,short,byte,long-return type Void.
System.out.println(Arrays.toString(x));
Arrays.sort(x);//sort()-->for all type of data taking array of data int,double,float,char,object,byte,short,long-R type Void
System.out.println(Arrays.toString(x));//for all type of data taking array of data int,double,float,char,object,byte,short,long-R type-Void.
System.out.println(Arrays.binarySearch(x, 2, 6,4));//binary search inperticular range excluding 6,can take array of all data type like sort()-R-boolean
System.out.println(Arrays.binarySearch(x, 7));//binary search in whole array,can take array of all data type like sort()-R type-boolean
int n[] =Arrays.copyOf(x, 8);//copy original array into new array having new size(can be more or less size),available for data type + object type-R type-R type of original array!!
System.out.println(Arrays.toString(n));
int y[]=Arrays.copyOfRange(x, 2, 6);////copy original array into new array having new size(can be more or less size) but specified range excluding ending index,available for data type + object type-R type-R type of original array!!
System.out.println(Arrays.toString(y));
//System.out.println(Arrays.deepEquals(n, x));
//System.out.println(Arrays.deepToString(x));
//System.out.println(Arrays.deepHashCode(a));
boolean b[]=new boolean[4];
Arrays.fill(b, true);//fiiling all element with true,available for all data type.R-type-Void.
Arrays.fill(b, false);//it will replace prvious all value with new one.
System.out.println(Arrays.toString(b));
Arrays.fill(b, 1, 3, true);//fiiling or replace all element with true excluding 3,available for all data type.R-type-Void.
System.out.println(Arrays.toString(b));
System.out.println(Arrays.hashCode(b));//available for all data type-R-type-int.
System.out.println(Arrays.equals(x, n));
								// 14 method for all data type!!! in Arrays  class!!!
ArrayList list=new ArrayList();
System.out.println(list.add(12));//R-type-boolean taking Object as Argument!!!
System.out.println(list.add("abc"));
System.out.println(list.add('c'));
System.out.println(list.add(true));
list.add(2, 12.50);//adding value to specified index any value R-type-void!!
System.out.println(list);
System.out.println(list.contains(2));//return true if contains 2.R-type-boolean!!taking Object
System.out.println(list.equals(2));
System.out.println(list.get(2));//R-type-Object.
list.clear();//deleting all elements!!!
System.out.println(list);
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
ArrayList list3=new ArrayList(20);//having capacity
list3.add(0);
list3.add(9);
list3.set(1,12);
list3.add(11);
System.out.println(list3);
boolean b1=list1.containsAll(list3);
System.out.println(b1);
boolean b3=list1.isEmpty();
System.out.println(b3);
System.out.println(list1.lastIndexOf(9));
System.out.println(list1.lastIndexOf(10));
boolean b4=list1.retainAll(list3);
System.out.println(b4);
System.out.println(list1);
System.out.println(list3);
list1.trimToSize();
System.out.println("1====="+list1);
//list3.remove(0);
//System.out.println(list1.remove(90));
System.out.println(list1.removeAll(list3));
System.out.println(list1);
Object o[]=list3.toArray();
for(Object c:o)
{
System.out.println(c);	
}
Object c=list3.toArray(o);
for(Object d:o)
{
System.out.println(d);	
}								//total 26+9(Object)=35 methods in ArrayList!!!
//LinkedList ll=new LinkedList(12);don't have initial capacity constructor
LinkedList ll=new LinkedList();
ll.addFirst(12);
ll.addFirst("abc");
ll.addLast(true);
ll.push('c');//R-type-void
System.out.println(ll.removeFirst());
System.out.println(ll.removeFirstOccurrence(1));
System.out.println(ll.removeLast());
System.out.println(ll.pop());
System.out.println(ll.pollFirst());
System.out.println(ll.pollLast());
System.out.println(ll.offer(12));
System.out.println(ll.offerFirst(12));
System.out.println(ll.offerLast(12));
System.out.println(ll.peekFirst());
System.out.println(ll.peekLast());
System.out.println(ll.descendingIterator());
System.out.println(ll.peek());
System.out.println(ll.peekFirst());
System.out.println(ll.element());
                   //LinkedList contain all 26 Methods of Arraylist + 20 his own Methods+9 object=55 methods.
System.out.println(ll.getFirst());
System.out.println(ll.getLast());
Vector v=new Vector(12);//declaring vector with capacity!!!
v.addElement(12);

Object[] o1=new Object[]{1,"abc",true};
v.copyInto(o);
System.out.println(v.elementAt(0));
System.out.println(v.firstElement());
System.out.println(v.indexOf("abc", 1));
v.insertElementAt(12.35, 3);
v.setElementAt(123, 2);
v.setSize(12);
v.removeElement(123);
v.removeElementAt(2);
v.removeAllElements();
System.out.println(v.lastElement());
System.out.println(v.lastIndexOf("abc", 2));
                   //vector has 26 method of ArrayList +9 Object class + 15 his own methods!!!
PriorityQueue p=new PriorityQueue();
p.comparator();
    // 18 methods of ArrayList + 1 his own methods+9 method of Object class=28 methods!!!

HashSet hs=new HashSet();
hs.add(12);
hs.add(12);
    // set having 9 methods of object class + 14 method of ArrayList!!!!=23 methods
LinkedHashSet lhs=new LinkedHashSet(12);
lhs.add(12);
 //hset same as set having 9 methods of object class + 14 method of ArrayList!!!!=23 methods
TreeSet ts=new TreeSet();
ts.add(9);
ts.add(3);
ts.add(10);
ts.add(0);
ts.ceiling("abc");


}
}
