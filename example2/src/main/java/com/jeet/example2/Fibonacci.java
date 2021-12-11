package com.jeet.example2;

public class Fibonacci {
    public int headRecursion(int x){
        if(x==0)
            return 0;
        if(x==1)
            return 1;
        return headRecursion(x-1)+headRecursion(x-2);
    }

    public int tailRecursion(int n, int a, int b){
        if(n==0)
            return a;
        if (n==1)
            return b;
        return tailRecursion(n-1,b,a+b);
    }
}
