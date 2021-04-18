package com.ds.algorithms.binaryHeap;

/**
 * @Author pankaj
 * @create 4/18/21 6:08 PM
 */
public class TestMaxHeap {
    public static void main(String[] args) {
        MaxPQ maxPQ=new MaxPQ(3);
        System.out.println("Size = "+maxPQ.size());
        System.out.println("isEmpty :: "+maxPQ.isEmpty());
        maxPQ.insert(4);
        maxPQ.insert(5);
        maxPQ.insert(2);
        maxPQ.insert(6);
        maxPQ.insert(1);
        maxPQ.insert(3);
        System.out.println(maxPQ.size());
        maxPQ.printMaxHeap();
    }
}
