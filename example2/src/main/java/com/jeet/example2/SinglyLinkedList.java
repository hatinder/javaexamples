package com.jeet.example2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class SinglyLinkedList {
    HashMap<String, Integer> integerHashMap = new HashMap<>();
    HashMap<String, HashSet<Integer>> doubleMap = new HashMap<>();

    public HashMap<String, HashSet<String>> firstHashMap=new HashMap<>();
    public HashMap<String, HashSet<String>> secondHashMap=new HashMap<>();

    HashMap<String, HashSet<String>> doubleStringMap = new HashMap<>();

    public void add(String left, String right) {
        Integer leftInt, rightInt;
        leftInt = Character.getNumericValue(left.charAt(0));
        rightInt = Character.getNumericValue(right.charAt(0));
        integerHashMap.put(left, leftInt);
        integerHashMap.put(right, rightInt);
        if (doubleMap.containsKey(left)) {
            doubleMap.get(left).add(integerHashMap.get(right));
        }
        else {
            doubleMap.put(left, new HashSet<>(Arrays.asList(integerHashMap.get(right))));
        }
        if (doubleMap.containsKey(right)) {
            doubleMap.get(right).add(integerHashMap.get(left));
        }
        else {
            doubleMap.put(right, new HashSet<>(Arrays.asList(integerHashMap.get(left))));
        }
    }

    public void add2(String first,String second){
        if(firstHashMap.containsKey(first)){
            firstHashMap.get(first).add(second);
        }
        else{
            firstHashMap.put(first,new HashSet<>(Arrays.asList(second)));
        }

        if(secondHashMap.containsKey(second)){
            secondHashMap.get(second).add(first);
        }
        else{
            secondHashMap.put(second,new HashSet<>(Arrays.asList(first)));
        }
    }

    public HashMap<String, HashSet<Integer>> getDoubleMap() {
        return doubleMap;
    }

//    public void updateConnection()
//    {
//        HashSet<Integer> keySet=new HashSet<Integer>(Arrays.asList(doubleMap.keySet().stream().map(k->Character.getNumericValue(k.charAt(0)))));
//
//    }
    public void createConnections(String left, String right) {
        if (doubleStringMap.containsKey(left)) {
            doubleStringMap.get(left).add(right);
        }
        else {
            doubleStringMap.put(left, new HashSet<>(Arrays.asList(right)));
        }
    }

    public void updateConnections(){
        for (String key:doubleStringMap.keySet()){
            for(String setKey: doubleStringMap.get(key)){
                if(doubleStringMap.containsKey(setKey)){
                    doubleStringMap.get(key).addAll(doubleStringMap.get(setKey));
                }
            }
        }
        Set<String> aSet=new HashSet<>();
        aSet.addAll(doubleStringMap.get("a"));
        Set<String> ySet=new HashSet<>();
        ySet.addAll(doubleStringMap.get("y"));
        aSet.retainAll(ySet);
        System.out.println(aSet);
    }


    public HashMap<String, HashSet<String>> getDoubleStringMap() {
        return doubleStringMap;
    }

    public HashMap<String, Integer> getIntegerHashMap() {
        return integerHashMap;
    }
}
