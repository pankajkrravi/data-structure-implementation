package com.ds.algorithms.arraylist.practice;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author pankaj
 * @create 4/10/21 10:26 PM
 */
//Write a Java program to update specific array element by given element
public class UpdateSpecificIndex {
    public static void main(String[] args) {
        List<String> stringList=new ArrayList<>();
        stringList.add("Red");
        stringList.add("Blue");
        stringList.add("Greed");
        stringList.add("White");
        stringList.add("Black");
        System.out.println(stringList);
        //set() is called to update value in AL
        stringList.set(3,"LightGreen");
        System.out.println(stringList);
    }
}
