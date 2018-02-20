package com.lara;
import java.util.*;
import java.util.concurrent.*;
class T5{

	public final static void main(String args[]){
CopyOnWriteArrayList list = new CopyOnWriteArrayList();
list.add("vivek");
list.add("kumar");
Iterator i =list.iterator();
list.add("abhishek");
while(i.hasNext()){
System.out.println(i.next());
list.add("abhishek");
}
System.out.println("After modification:");
Iterator i2 =list.iterator();
while(i2.hasNext()){
System.out.println(i2.next());
}
}
}