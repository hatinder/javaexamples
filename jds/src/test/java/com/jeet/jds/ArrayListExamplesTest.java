package com.jeet.jds;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import static org.junit.Assert.*;

public class ArrayListExamplesTest {

    @Test
    public void run() {
        assertTrue(ArrayListExamples.run());
    }

    @Test
    public void benchmarkSort() {
    }

    @Test
    public void testBenchmarkSort() {
        List<Integer> sizeList = Arrays.asList(1000, 10_000, 100_000, 1_000_000, 10_000_000,100_000_000);
        for (int i = 0; i < sizeList.size(); i++) {
            int randomIntegerList[] = new int[sizeList.get(i)];
            for (int j = 0; j < sizeList.get(i); j++) {
                randomIntegerList[j] = ThreadLocalRandom.current().nextInt(0, sizeList.get(i));
            }
            Instant startTime = Instant.now();
            ArrayListExamples.benchmarkSort(randomIntegerList);
            Instant endTime = Instant.now();
            System.out.println(String.format("Time Taken to sort size: %,d - %,d ms", sizeList.get(i), Duration.between(startTime, endTime).toMillis()));
        }
    }

    @Test
    public void benchmarkParallelSort() {
        List<Integer> sizeList = Arrays.asList(1000, 10_000, 100_000, 1_000_000, 10_000_000,100_000_000);
        for (int i = 0; i < sizeList.size(); i++) {
            int randomIntegerList[] = new int[sizeList.get(i)];
            for (int j = 0; j < sizeList.get(i); j++) {
                randomIntegerList[j] = ThreadLocalRandom.current().nextInt(0, sizeList.get(i));
            }
            Instant startTime = Instant.now();
            ArrayListExamples.benchmarkParallelSort(randomIntegerList);
            Instant endTime = Instant.now();
            System.out.println(String.format("Time Taken to sort size: %,d - %,d ms", sizeList.get(i), Duration.between(startTime, endTime).toMillis()));
        }
    }
}