package com.ds.algorithms.arraylist.practice;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author pankaj
 * @create 4/10/21 10:23 PM
 */
//Write a Java program to retrieve an element (at a specified index) from a given array list
public class SpecificIndexInsertionPro {
    public static void main(String[] args) {
        List list=new ArrayList();
        list.add("Pankaj");
        list.add("Madan Mohan");
        list.add("Ravi kanth");
        list.add("Jatan Veer");
        list.add(0,"laila");
        System.out.println(list);
        list.add(3,"All is Well !!!");
        System.out.println(list);
    }
}
