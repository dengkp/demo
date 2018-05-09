package com.demo.mq;

/**
 * Author:   dengkp
 * Date:     2018/5/9 11:17
 * Description: test
 * Since: 1.0
 */
class Producer implements Runnable {
    private Clerk clerk;

    public Producer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        System.out.println("Producer making...");
        for (int product = 1; product <= 1000; product++) {
            try {
                clerk.product(product);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer implements Runnable {
    private Clerk clerk;

    public Consumer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        System.out.println("Consumer buying...");
        for (int i = 1; i <= 1000; i++) {
            try {
                clerk.consumer();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


public class Test {

    public static void main(String[] args) {
        Clerk clerk = new Clerk();
        new Thread(new Consumer(clerk)).start();
        new Thread(new Producer(clerk)).start();

    }
}