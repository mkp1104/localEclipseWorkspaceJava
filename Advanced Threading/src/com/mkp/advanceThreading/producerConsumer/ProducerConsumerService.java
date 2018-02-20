package com.mkp.advanceThreading.producerConsumer;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerService {

    public static void main(String[] args) {
        //Creating BlockingQueue of size 10 should be more than 0 otherwise java.lang.IllegalArgumentException. 
//        BlockingQueue<Message> queue = new ArrayBlockingQueue<>(0);
        BlockingQueue<Message> queue = new ArrayBlockingQueue<>(1);
    	Producer producer = new Producer(queue);
        Consumer consumer = new Consumer(queue);
        //starting producer to produce messages in queue
        new Thread(producer).start();
        //starting consumer to consume messages from queue
        new Thread(consumer).start();
        System.out.println("Producer and Consumer has been started");
    }

}