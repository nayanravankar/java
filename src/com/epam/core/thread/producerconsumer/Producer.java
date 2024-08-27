package com.epam.core.thread.producerconsumer;

public class Producer implements Runnable{


    private final CustomBlockingQueue<Integer> queue;
    private final String producerId;

    public Producer(CustomBlockingQueue<Integer> queue, String producerId) {
        this.queue = queue;
        this.producerId = producerId;
    }

    @Override
    public void run() {

        for (int i =1; i<100; i++){
            try {
                queue.put(i);
                System.out.println("Producer "+producerId+", put entry "+i);
                Thread.sleep((long) (Math.random()*1000));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
