package com.mkp.ola.question8.method1;


//Create two threads, one display odd & other even numbers


public class EnenAndOddThread {

    public static void main(String[] args) {
        Runnable r = new Runnable1();
        Thread t = new Thread(r);
        t.start();
        
        Runnable r2 = new Runnable2();
        Thread t2 = new Thread(r2);
        t2.start();
    }
}

class Runnable2 implements Runnable{
    public void run(){
        for(int i=0;i<11;i++){
            if(i%2 == 1)
                System.out.println("Thread: " + Thread.currentThread().getName() + " :Odd: " + i);
        }
    }
}

class Runnable1 implements Runnable{
    public void run(){
        for(int i=0;i<11;i++){
            if(i%2 == 0)
            	 System.out.println("Thread: " + Thread.currentThread().getName() + " :Even: " + i);
        }
    }
}