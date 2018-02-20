package com.mkp.advanceThreading;


public class DeadLockFixed extends Thread {

    /**
     * Both method are now requesting lock in same order, first Integer and then String.
     * You could have also done reverse e.g. first String and then Integer,
     * both will solve the problem, as long as both method are requesting lock
     * in consistent order.
     */
	
	DeadLockFixed obj1;
    public void method1() {
        synchronized (Integer.class) {
            System.out.println("Aquired lock on Integer.class object");

            synchronized (String.class) {
                System.out.println("Aquired lock on String.class object");
            }
        }
    }

    public void method2() {
        synchronized (Integer.class) {
            System.out.println("Aquired lock on Integer.class object");

            synchronized (String.class) {
                System.out.println("Aquired lock on String.class object");
            }
        }
    }
/*    If you have looked above code carefully then you 
    may have figured out that real reason for deadlock
    is not multiple threads but the way they are requesting
    lock , if you provide an ordered access then problem will
    be resolved , here is my fixed version, which avoids 
    deadlock by avoiding circular wait with no preemption.*/

    public void run(){
		obj1.method1();
	}
	public static void main(String[] args) {
		DeadLockFixed obj = new DeadLockFixed();
		obj.obj1 = obj;
		obj.start();
		obj.method2();
	}
}
/*Now there would not be any deadlock because both methods 
are accessing lock on Integer and String class literal in
same order. So, if thread A acquires lock on Integer 
object , thread B will not proceed until thread A 
releases Integer lock, same way thread A will not be 
blocked even if thread B holds String lock because now 
thread B will not expect thread A to release Integer 
lock to proceed further.*/

