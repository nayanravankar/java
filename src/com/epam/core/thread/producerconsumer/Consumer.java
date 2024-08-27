package com.epam.core.thread.producerconsumer;

public class Consumer implements Runnable{
    private final CustomBlockingQueue<Integer> queue;
    private final String consumerId;

    public Consumer(CustomBlockingQueue<Integer> queue, String consumerId) {
        this.queue = queue;
        this.consumerId = consumerId;
    }

    @Override
    public void run() {

        while (true){
            try {
                Integer item = queue.pull();
                System.out.println("consumer "+consumerId+", fetch entry "+item);
                Thread.sleep((long) (Math.random()*1000));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }



    }
}
