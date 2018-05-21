package com.demo.mq;


import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;

public class BlockMq {
    public static void main(String[] args) {

        final BlockingQueue<String> bq = new SynchronousQueue<String>(true);
        Runnable producerRunnable = new Runnable() {
            int i = 1;

            public void run() {
                while (true) {
                    try {
                        System.out.println("我生产了一个" + i++);
                        bq.put(i + "");
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        Runnable customerRunnable = new Runnable() {
            public void run() {
                while (true) {
                    try {
                        System.out.println("我消费了一个" + bq.take());
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        Thread producerThread = new Thread(producerRunnable);
        Thread customerThread = new Thread(customerRunnable);
        producerThread.start();
        customerThread.start();
    }
}