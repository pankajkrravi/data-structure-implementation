package com.ds.algorithms.arraylist.practice;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author pankaj
 * @create 4/10/21 10:13 PM
 */
//Write a Java program to iterate through all elements in a array list.
public class IterateProgram {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("Jatan Veer");
        list.add("Hari Patel");
        list.add(454);
        list.add(551);
        list.add("Bangalore");
        for (Object o:list) {
                System.out.println(o);
        }
    }

}
