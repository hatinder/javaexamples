package com.jeet.example2;

import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class DataStructureTest {
    List<String> name= Arrays.asList("Apple","Banana","Carrot");
    ArrayList<String> nameAL= new ArrayList<>(Arrays.asList("Apple","Banana","Carrot"));
    LinkedList<String> nameLL=new LinkedList<>(Arrays.asList("Apple","Banana","Carrot"));
    Vector<String> nameV=new Vector<>(Arrays.asList("Apple","Banana","Carrot"));
    Stack<String> nameS=new Stack<>();

    @Before
    public void setUp() throws Exception {
        System.out.println(name);
        System.out.println(name.size());
        nameAL.add("Donut");
        System.out.println(nameAL);
        System.out.println(nameAL.size());

        Iterator<String> itr=nameAL.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println(nameLL);
        System.out.println(nameLL.size());

        Iterator<String> itrLL=nameLL.iterator();
        while(itrLL.hasNext()){
            System.out.println(itrLL.next());
        }

        Iterator<String> itrv=nameV.iterator();
        while(itrv.hasNext()){
            System.out.println(itrv.next());
        }

    }

    @Test
    public void sayHello() {
        DataStructure.sayHello();
    }
}