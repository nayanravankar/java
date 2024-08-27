package com.epam.core.thread.jointask;

public class JoinTaskDemo {

    public static void main(String[] args) throws InterruptedException {

        extracted();

    }

    private static void extracted() throws InterruptedException {
        Thread t1 = new Thread(new JoinTask());
        t1.setName("Join-task-1");
        Thread t2 = new Thread(new JoinTask());
        t2.setName("Join-task-2");
        Thread t3 = new Thread(new JoinTask());
        t3.setName("Join-task-3");

        t1.start();
        System.out.println("current thread - "+Thread.currentThread().getName());
        t1.join();

        t2.start();
        System.out.println("current thread - "+Thread.currentThread().getName());
        t2.join();

        t3.start();
        System.out.println("current thread - "+Thread.currentThread().getName());
        t3.join();
    }
}
