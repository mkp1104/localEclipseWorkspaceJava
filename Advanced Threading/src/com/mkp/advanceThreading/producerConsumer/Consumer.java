package com.mkp.advanceThreading.producerConsumer;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable{

private BlockingQueue<Message> queue;
    
    public Consumer(BlockingQueue<Message> q){
        this.queue=q;
    }

    @Override
    public void run() {
        try{
           
		//we have to use some conditional loop to consume
//        Continually otherwise it will consume on 1 time.
//        	from point of view it is not perfect implementation.
			Message msg;
            //consuming messages until exit message is received
            while((msg = queue.take()).getMsg() !="exit"){
//          while(true){ // this proves consumer should be running ...
			Thread.sleep(1000);
            msg = queue.take();
            System.out.println("Consumed "+msg.getMsg());
            }
        }catch(InterruptedException e) {
            e.printStackTrace();
        }
    }
}
