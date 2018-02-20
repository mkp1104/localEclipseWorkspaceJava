package com.mkp.advanceThreading;

/**
 * * Java program to create a deadlock by imposing circular wait. * * @author
 * WINDOWS 8 *
 */
/*If method1() and method2() both will be called by two or
many threads , there is a good chance of deadlock because
if thread 1 acquires lock on Sting object while executing
method1() and thread 2 acquires lock on Integer object 
while executing method2() both will be waiting for each
other to release lock on Integer and String to proceed further
which will never happen.*/


//Read more: http://javarevisited.blogspot.com/2010/10/what-is-deadlock-in-java-how-to-fix-it.html#ixzz55BhfGdT1
public class DeadLockDemo extends Thread { /*
							 *  * This method request two locks, first String and
							 * then Integer
							 */
	DeadLockDemo obj1;
	public void method1() {
		synchronized (String.class) {
			/*try{
				Thread.sleep(100);
			}
			catch(Exception e){
				
			}*/
			System.out.println("Aquired lock on String.class object");
			synchronized (Integer.class) {
				
				System.out.println("Aquired lock on Integer.class object");
			}
		}
	} /*
	 *  * This method also requests same two lock but in exactly * Opposite order
	 * i.e. first Integer and then String. * This creates potential deadlock, if
	 * one thread holds String lock * and other holds Integer lock and they wait
	 * for each other, forever.
	 */

	public void method2() {
		synchronized (Integer.class) {
			System.out.println("Aquired lock on Integer.class object");
			synchronized (String.class) {
				/*try{
					Thread.sleep(100);
				}
				catch(Exception e){
					
				}*/
				System.out.println("Aquired lock on String.class object");
			}
		}
	}
	public void run(){
		obj1.method1();
	}
	public static void main(String[] args) {
		/*DeadLockDemo obj = new DeadLockDemo();
		obj.obj1 = obj;
		obj.start();
		obj.method2();*/
//		DeadLockDemo obj2 = new DeadLockDemo();
//		obj1.method1();
//		obj1.method2();
		Run1 run1 = new Run1();
		Thread t1 = new Thread(run1);
		Run2 run2 = new Run2();
		Thread t2 = new Thread(run2);
		t1.start();
		t2.start();
		
	}
}
class Run1 implements Runnable{
	DeadLockDemo obj = new DeadLockDemo();
	@Override
	public void run() {
//		DeadLockDemo obj = new DeadLockDemo();
		obj.method1();
		
	}
	
}

class Run2 implements Runnable{
	DeadLockDemo obj = new DeadLockDemo();
	@Override
	public void run() {
//		DeadLockDemo obj = new DeadLockDemo();
		obj.method2();
		
	}
	
}

// Read more:
// http://javarevisited.blogspot.com/2010/10/what-is-deadlock-in-java-how-to-fix-it.html#ixzz55Bgs81VF