package com.jeet.jds;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListExamples {
    public static boolean run(){
        List<String> stockList= Arrays.asList("AAPL","AMGN","AXP","BA","CAT","CRM","CSCO","CVX","DIS","DOW","GS","HD","HON","IBM","INTC","JNJ","JPM","KO",
            "MCD","MMM","MRK","MSFT","NKE","PG","TRV","UNH","V","VZ","WBA","WMT");
        System.out.println("List Size: " + stockList.size());
        for (String stock :
            stockList) {
            System.out.println(stock);
        }
        Iterator<String> stringIterator=stockList.listIterator();
        System.out.println("Using Iterator");
        while (stringIterator.hasNext()){
            System.out.println(stringIterator.next());
        }
        return true;
    }
}
