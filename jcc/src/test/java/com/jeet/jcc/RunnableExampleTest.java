package com.jeet.jcc;

import org.junit.Test;

import static org.junit.Assert.*;

public class RunnableExampleTest {

    @Test
    public void run() throws InterruptedException {
        RunnableExample runnableExample=new RunnableExample();
        Runnable runnable=()->{System.out.println("Lambda Runnable");};
        Thread thread=new Thread(runnableExample);
        Thread thread1=new Thread(runnable);
        thread.start();
        thread1.start();
        thread.join();
        thread1.join();

    }
}