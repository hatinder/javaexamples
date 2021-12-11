package com.jeet.jcc;

import org.junit.Test;

import java.util.concurrent.ExecutionException;

import static org.junit.Assert.*;

public class ExecutorExampleTest {

    @Test
    public void runExample() {

        try {
            assertTrue(ExecutorExample.runExample());
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}