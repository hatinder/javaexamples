package com.jeet.example2;

import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTest {

    @Test
    public void headRecursion() {
        Fibonacci fibonacci=new Fibonacci();
        int result=fibonacci.headRecursion(20);
        System.out.println("Result: " + result);
        assertEquals(6765, result);

    }

    @Test
    public void tailRecursion() {
        Fibonacci fibonacci=new Fibonacci();
        int result=fibonacci.tailRecursion(20,0,1);
        System.out.println("Result: " + result);
        assertEquals(6765, result);

    }
}