package com.epam.core.thread.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class ExecutorPractice {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(10);
        executorService.submit(() -> {
            IntStream.range(0,100).forEach(System.out::println);

        });
        executorService.shutdown();
    }
}
