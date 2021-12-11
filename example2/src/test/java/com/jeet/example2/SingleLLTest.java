package com.jeet.example2;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class SingleLLTest {
//    List<Integer>

    @Test
    public void addNode() {
    }

    @Test
    public void display() {
        SingleLL sll=new SingleLL();
        sll.addNode(1);
        sll.addNode(2);
        sll.addNode(3);
        sll.addNode(4);

        sll.display();
    }
}