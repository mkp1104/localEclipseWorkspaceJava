package com.lara;
import java.util.*;
import java.util.concurrent.*;
class T7{
	
public final static void main(String args[]){
CopyOnWriteArrayList list = new CopyOnWriteArrayList();
list.add("vivek");
list.add("kumar");
Iterator i =list.iterator();

while(i.hasNext()){
System.out.println(i.next());//on next call it will give error!!!
list.add("abhishek");
i.remove();
}
}
}