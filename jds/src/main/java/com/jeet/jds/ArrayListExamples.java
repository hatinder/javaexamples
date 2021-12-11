package com.jeet.jds;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class ArrayListExamples {
    public static boolean run() {
        ArrayList<String> stocksArrayList = new ArrayList<>();
        String[] DJI = {"AAPL", "AMGN", "AXP", "BA", "CAT", "CRM", "CSCO", "CVX", "DIS", "DOW", "GS", "HD", "HON", "IBM", "INTC", "JNJ", "JPM", "KO", "MCD", "MMM", "MRK", "MSFT",
            "NKE", "PG", "TRV", "UNH", "V", "VZ", "WBA", "WMT"};
        for (int i = 0; i < DJI.length; i++) {
            stocksArrayList.add(DJI[i]);
        }
        System.out.println(stocksArrayList);
        System.out.println(Arrays.binarySearch(stocksArrayList.toArray(), "WBA"));

        return true;

    }

    public static boolean benchmarkSort(int[] randomIntegerList) {
        Arrays.sort(randomIntegerList);
        return true;
    }

    public static boolean benchmarkParallelSort(int[] randomIntegerList) {
        Arrays.parallelSort(randomIntegerList);
        return true;
    }
}
