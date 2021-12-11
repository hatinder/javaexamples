package com.jeet.jcc;

import org.junit.Test;

import static org.junit.Assert.*;

public class ThreadExampleTest {

    @Test
    public void run() {
        ThreadExample threadExample=new ThreadExample();
        threadExample.start();
        try {
            threadExample.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}