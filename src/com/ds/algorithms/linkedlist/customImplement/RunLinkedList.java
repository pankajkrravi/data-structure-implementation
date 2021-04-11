package com.ds.algorithms.linkedlist.customImplement;

/**
 * @Author pankaj
 * @create 4/11/21 6:21 PM
 */
public class RunLinkedList {
    public static void main(String[] args) {
            LinkedList linkedList=new LinkedList();
            linkedList.add(10);
            linkedList.add(45);
            linkedList.add(78);
            linkedList.addAtFirst(520);
            linkedList.addAtIndex(3,300);
            linkedList.addAtIndex(0,100);
            linkedList.display();
            linkedList.deleteAt(1);
            linkedList.display();
    }
}
