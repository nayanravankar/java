package com.epam.core.thread.jointask;

public class JoinTask implements Runnable{


    @Override
    public void run() {
        System.out.println("join thread "+ Thread.currentThread().getName());
        try {
            Thread.sleep(5000);
            System.out.println(Thread.currentThread().getName() + ", completed");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
