package com.ds.algorithms.arraylist.practice;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author pankaj
 * @create 4/10/21 10:18 PM
 */
// Write a Java program to insert an element into the array list at the first position.
public class InsertEleAtSpecificIndexPro {
    public static void main(String[] args) {
        List list=new ArrayList();
        list.add("Pankaj");
        list.add("Madan Mohan");
        list.add("Ravi kanth");
        list.add("Jatan Veer");
        list.add(0,"laila");
        System.out.println(list);

    }
}
