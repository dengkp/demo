package com.demo.mq;

/**
 * Author:   dengkp
 * Date:     2018/5/9 11:38
 * Description:
 * Since: 1.0
 */
public class Clerk {
    public int product;
    boolean have = false;

    public synchronized void product(int product) throws InterruptedException {
        if (have) {
            wait();
        }
        have = true;
        this.product = product;
        System.out.println("product prod :" + product);
        notify();
    }

    public synchronized void consumer() throws InterruptedException {
        if (!have) {
            wait();
        }
        int p = this.product;
        System.out.println("Consumer get :" + p);
        have = false;
        notify();
    }

}
