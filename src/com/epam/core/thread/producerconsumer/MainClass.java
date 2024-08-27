package com.epam.core.thread.producerconsumer;

import com.epam.core.design.factory.Profession;

import java.util.stream.Collectors;

public class MainClass {

    public static void main(String[] args) {

        CustomBlockingQueue<Integer> buffer= new CustomBlockingQueue<>(10);

        Producer producer1 = new Producer(buffer,"p1");
        Producer producer2 = new Producer(buffer,"p2");

        Consumer consumer1 = new Consumer(buffer,"c1");
        Consumer consumer2 = new Consumer(buffer,"c2");

        Thread t1 = new Thread(producer1);
        Thread t2 = new Thread(producer2);

        Thread t3 = new Thread(consumer1);
        Thread t4 = new Thread(consumer2);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
