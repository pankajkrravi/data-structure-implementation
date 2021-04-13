package com.ds.algorithms.linkedlist.CircularSLL;

/**
 * @Author pankaj
 * @create 4/13/21 1:21 PM
 */
public class MainRunnerCircular {
    public static void main(String[] args) {
        CircularSinglyLinkedList circularSinglyLinkedList=new CircularSinglyLinkedList();
        //circularSinglyLinkedList.createCircularSinglyLinkedList();
        /*circularSinglyLinkedList.insertFirst(2);
        circularSinglyLinkedList.insertFirst(8);"Deleted First: "+
        circularSinglyLinkedList.insertFirst(100);*/
        circularSinglyLinkedList.insertLast(1);
        circularSinglyLinkedList.insertLast(2);
        circularSinglyLinkedList.insertLast(3);
        circularSinglyLinkedList.printCircularSLL();
        System.out.println("======================================================");
        System.out.println("Deleted First: "+ circularSinglyLinkedList.removeFirst());
        System.out.println("Deleted First: "+circularSinglyLinkedList.removeFirst());
        System.out.println("Deleted First: "+circularSinglyLinkedList.removeFirst());
        circularSinglyLinkedList.printCircularSLL();
    }
}
