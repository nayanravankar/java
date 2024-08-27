package com.epam.core.thread.producerconsumer;

import java.util.LinkedList;
import java.util.Queue;

public class CustomBlockingQueue<T> {

    private  final Queue<T>  queue = new LinkedList<>();
    private final Integer max ;

    public CustomBlockingQueue(int max) {
        this.max = max;
    }

    public synchronized void put(T item) throws InterruptedException {
        while(queue.size() == max){
            wait();
        }
        queue.add(item);
        notifyAll();
    }

    public synchronized T pull() throws InterruptedException {
        while (queue.isEmpty()){
            wait();
        }
        T item = queue.poll();
        notifyAll();
        return item;
    }
}
