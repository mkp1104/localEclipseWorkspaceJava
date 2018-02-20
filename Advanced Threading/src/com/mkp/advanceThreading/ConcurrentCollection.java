package com.mkp.advanceThreading;


//Java program to illustrate ConcurrentCollection uses
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.*;
class ConcurrentCollection extends Thread {
 static CopyOnWriteArrayList l = 
                  new CopyOnWriteArrayList();
 @SuppressWarnings("unchecked")
public void run()
 {
     try {
         Thread.sleep(100);
     }
     catch (InterruptedException e) {
         System.out.println("Child Thread"
                  + " going to add element");
     }

     // Child thread trying to add new
     // element in the Collection object
     l.add("D");
 }

 @SuppressWarnings("unchecked")
public static void main(String[] args)
     throws InterruptedException
 {
     l.add("A");
     l.add("B");
     l.add("c");

     // We create a child thread that is
     // going to modify ArrayList l.
     ConcurrentCollection t = new ConcurrentCollection();
     t.start();

     // Now we iterate through the ArrayList
     // and get exception.
     @SuppressWarnings("rawtypes")
	Iterator itr = l.iterator();
     while (itr.hasNext()) {
         String s = (String)itr.next();
         System.out.println(s);
         Thread.sleep(3000);
     }
//     System.out.println(l);
     Iterator itrNew = l.iterator();
     while (itrNew.hasNext()) {
         String s = (String)itrNew.next();
         System.out.println(s);
         Thread.sleep(1000);
     }
 }
}