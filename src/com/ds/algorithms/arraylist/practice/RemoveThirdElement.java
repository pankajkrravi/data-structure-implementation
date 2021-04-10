package com.ds.algorithms.arraylist.practice;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author pankaj
 * @create 4/10/21 10:32 PM
 */
//Remove the third element from a array list
public class RemoveThirdElement {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("Pankaj");
        list.add("Madan Mohan");
        list.add("Ravi kanth");
        list.add("Jatan Veer");
        list.add(0, "laila");
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
    }
}
