package com.ds.algorithms.arraylist.practice;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author pankaj
 * @create 4/10/21 10:07 PM
 */
//Write a Java program to create a new array list, add some colors (string) and print out the collection
public class AddColoursProgram {
    public static void main(String[] args) {
        List<String> stringList=new ArrayList<>();
        stringList.add("Red");
        stringList.add("Blue");
        stringList.add("Greed");
        stringList.add("White");
        stringList.add("Black");
        System.out.println(stringList);
    }
 }
