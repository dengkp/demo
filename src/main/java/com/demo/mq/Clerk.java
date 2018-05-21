package com.demo.mq;

/**
 * Author:   dengkp
 * Date:     2018/5/9 11:38
 * Description:
 * Since: 1.0
 */
public class Clerk {

    private int product;
    private boolean have;

    public synchronized void pro(int product) throws InterruptedException {

        if (have) {
            wait();
        }

        have = true;
        this.product = product;
        System.out.println("pro===>" + product);
        notifyAll();
    }

    public synchronized void cu() throws InterruptedException {
        if (!have) {
            wait();
        }
        have = false;
        System.out.println("cu===>" + product);
        notifyAll();

    }


}


//    int product;
//    boolean have;
//
//
//    public synchronized void pro(int product) throws InterruptedException {
//        if (have) {
//            wait();
//        }
//        have = true;
//        this.product = product;
//        System.out.println("p:" + product);
//        notify();
//    }
//
//    public synchronized void cu() throws InterruptedException {
//        if (!have) {
//            wait();
//        }
//        have = false;
//        System.out.println("c:" + product);
//        notify();
//    }
