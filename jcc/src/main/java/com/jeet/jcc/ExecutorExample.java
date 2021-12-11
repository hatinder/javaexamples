package com.jeet.jcc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;
import java.util.concurrent.*;

public class ExecutorExample {
    public static boolean runExample() throws ExecutionException, InterruptedException {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        System.out.println("Available Processors: " + availableProcessors);
        int poolSize = availableProcessors * 4;
        ExecutorService pool = Executors.newFixedThreadPool(poolSize);
        Collection<Future<Long>> futures = new ArrayList<>();
        for (int i = 0; i < poolSize * 3; i++) {
            final int submitOrder = i;
            futures.add(pool.submit(new Callable<Long>() {
                @Override
                public Long call() throws Exception {
                    Random r = new Random();
                    long total = 0;
                    for (int i = 0; i < 10000000; i++) {
                        total += r.nextInt(5);
                    }
                    return total * 10000 + submitOrder;
                }
            }));
        }
        for (Future<Long> future : futures) {
            System.out.println(future.get());
        }
        pool.shutdown();
        return true;
    }
}
