package com.mkp.advanceThreading;


import java.util.concurrent.Callable;

public class MyCallable1 implements Callable<String> {

	private long waitTime;
	
	public MyCallable1(int timeInMillis){
		this.waitTime=timeInMillis;
	}
	@Override
	public String call() throws Exception {
		//instead of sleep, check for some other function call like asynchronous calls. 
		Thread.sleep(waitTime);
        //return the thread name executing this callable task
        return Thread.currentThread().getName();
	}

}