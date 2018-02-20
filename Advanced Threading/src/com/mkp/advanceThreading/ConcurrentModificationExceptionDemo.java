package com.mkp.advanceThreading;

//Java program to illustrate Traditional 
//Collections Problem
import java.util.*;
class ConcurrentModificationExceptionDemo extends Thread {
 static ArrayList l = new ArrayList();
 public void run()
 {
     try {
         Thread.sleep(2000);
     }
     catch (InterruptedException e) {
         System.out.println("Child Thread"
                 + " going to add element");
     }

     // Child thread trying to add new
     // element in the Collection object
     l.add("D");
 }

 public static void main(String[] args)
     throws InterruptedException
 {
     l.add("A");
     l.add("B");
     l.add("c");

     // We create a child thread that is
     // going to modify ArrayList l.
     ConcurrentModificationExceptionDemo t = new ConcurrentModificationExceptionDemo();
     t.start();

     // Now we iterate through the ArrayList
     // and get exception.
     Iterator itr = l.iterator();
     while (itr.hasNext()) {
         String s = (String)itr.next();
         System.out.println(s);
         Thread.sleep(6000);
     }
     System.out.println(l);
 }
}