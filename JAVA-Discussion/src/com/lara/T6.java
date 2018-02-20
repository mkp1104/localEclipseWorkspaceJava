package com.lara;
import java.util.*;
class T6{
public final static void main(String args[]){
ArrayList list = new ArrayList();

list.add("vivek");
list.add("kumar");

Iterator i =list.iterator();

while(i.hasNext()){

	System.out.println(i.next());
	i.remove();
}

System.out.println("After modification:");

Iterator i2 =list.iterator();
while(i2.hasNext())
{
System.out.println(i2.next());;
}
}
}