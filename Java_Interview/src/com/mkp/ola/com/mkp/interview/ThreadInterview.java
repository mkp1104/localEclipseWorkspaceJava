/*
 * Copyright (C) 2018 { Manish Kumar Prasad } <manis.aec1104@gmail.com>
 * This file is part of localEclipseWorkspaceJava.
 * project can not be copied and/or distributed
 * without the express permission of { Manish Kumar Prasad }.
 */

package com.mkp.interview;

class Thread0 extends Thread {
    public void run() {
        System.out.println("Thread0 - run()");
        testA();

    }

    public synchronized void testA() {
        System.out.println("synchronize Thread-0 testA()");
        try {
//            System.out.println("Going in sleep for 1000ms.");
            System.out.println("Going in wait.");
            wait();
//            Thread.sleep(1000);
        }catch (InterruptedException e){
                e.printStackTrace();
        }
    }

    public synchronized void testB() {
        System.out.println("synchronize Thread-0 testB()");
        try {
            System.out.println("Going in sleep for 1000ms.");
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

class Thread1 extends Thread0 {
    @Override
    public void run() {
        System.out.println("Thread1 run()");
    }
}

public class ThreadInterview {
    public static void main(String args[]) {
        Thread0 t0 = new Thread0();
        t0.start();
        t0.testB();
        System.out.println("Thread-Main");
    }
}
