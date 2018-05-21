package com.demo.mq;

/**
 * Author:   dengkp
 * Date:     2018/5/9 11:17
 * Description: test
 * Since: 1.0
 */


public class Test {

    public static void main(String[] args) {
        Clerk clerk = new Clerk();
        new Thread(new P(clerk)).start();
        new Thread(new C(clerk)).start();

    }

}

class P implements Runnable {

    private Clerk clerk;

    public P(Clerk clerk) {
        this.clerk = clerk;
    }


    @Override
    public void run() {

        for (int i = 1; i <= 1000; i++) {

            try {
                clerk.pro(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class C implements Runnable {
    private Clerk clerk;

    public C(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            try {
                clerk.cu();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

