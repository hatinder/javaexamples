package com.jeet.jds;

import java.util.Arrays;
import java.util.Iterator;

public class ArraysExamples {
    public static boolean run(){
        int[] values={1,2,3,4};
        for(int i=0;i<values.length;i++){
            System.out.println(values[i]);
        }
        String[] DJI={"AAPL","AMGN","AXP","BA","CAT","CRM","CSCO","CVX","DIS","DOW","GS","HD","HON","IBM","INTC","JNJ","JPM","KO","MCD","MMM","MRK","MSFT",
            "NKE","PG","TRV","UNH","V","VZ","WBA","WMT"};
        Arrays.sort(DJI);
        for (int i = 0; i < DJI.length; i++) {
            System.out.println(DJI[i]);
        }
        System.out.println(Arrays.binarySearch(DJI,"IBM")); //return index or negative value if not found!
        Iterator<String> iterator= Arrays.stream(DJI).iterator();
        System.out.println("Using Iterator");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        return true;
    }
}
