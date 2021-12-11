package com.jeet.example2;

public class SortingExample implements Comparable<SortingExample> {
    public Integer A;
    @Override
    public int compareTo(SortingExample o) {
        return this.A-o.A;
    }
}
