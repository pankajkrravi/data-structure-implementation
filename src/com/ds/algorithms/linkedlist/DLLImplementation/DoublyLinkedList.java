package com.ds.algorithms.linkedlist.DLLImplementation;

import java.util.NoSuchElementException;

/**
 * @Author pankaj
 * @create 4/12/21 7:05 PM
 */
public class DoublyLinkedList {
    private Node head;// first node of DLL
    private Node tail;//Last Node of DLL
    private int length;// length of DLL

    private class Node{
        private int data;
        private Node next;
        private Node previous;
        Node(int data) {
            this.data=data;
        }
    }
    // constructor
    DoublyLinkedList()
    {
        this.head=null;
        this.tail=null;
        this.length=0;
    }
    // isEmpty()
    // two ways to check , DLL is Empty 1. By checking head ref 2. By checking DLL length is zero(0)
    public boolean isEmpty()
    {
        if(head==null)
            return true;
        else return false;
       // return length==0;// DLL is empty-> true
    }
    //length() of DLL
    public int length()
    {
        return length;
    }

    //-------------------  print DLL in Forward Direction -----------------------
    public void printDLLForward()
    {
         if (head==null) {
             return;
         }
        Node traverse=head;
        while (traverse !=null)
        {
            System.out.print(traverse.data+" --> ");
            traverse=traverse.next;
        }
        System.out.println("null");
    }
    // ------------------------ print DLL in Backward Direction ----------------------
    public void printDLLBackward()
    {
        if (tail==null) {
            return;
        }
        Node traverse=tail;
        while (traverse !=null)
        {
            System.out.print(traverse.data+" --> ");
            traverse=traverse.previous;
        }
        System.out.println("null");
    }
        //------------------- insertFirst ---------------------
        public void insertFirst(int data){
        Node newNode=new Node(data);
        if (isEmpty())
        {
            tail=newNode;
        }else {
            head.previous=newNode; //========
        }
        newNode.next=head;
        head=newNode;
        length++;
        }

    // -----------------insertLast ------------------------------------------
    public void insertLast(int data)
    {
        Node newNode=new Node(data);
        if (isEmpty())
        {
            head=newNode;// head is constant
        } else {
            tail.next=newNode;//--------
            newNode.previous=tail;
        }
        tail=newNode;
        length++;
    }
    // -------------------------------delete First ------------------------------
    public Node deleteFirst()
    {
        if (isEmpty())
        {
            throw new NoSuchElementException("DLL is Already Empty !!!!");
        }
        Node newNode= head;
        if (head == tail)
        {
            tail=null;
        } else {
            head.next.previous=null;
        }
        head=head.next;
        newNode.next=null;
        length--;
        return newNode;
    }
    // ------------------ delete Last -------------------------
        public Node deleteLast()
        {
            if(isEmpty()) {
                throw new NoSuchElementException();
            }
            Node newNode=tail;
            if (head==tail)
            {
                head=null;
            } else {
                tail.previous.next=null;
            }
            tail= tail.previous;
            newNode.previous=null;
            length--;
            return newNode;
        }
    public static void main(String[] args) {
        DoublyLinkedList dll=new DoublyLinkedList();
        /*dll.insertFirst(0);
        dll.insertFirst(1);
        dll.insertFirst(5);
        dll.insertFirst(7);
        dll.insertFirst(9);
        dll.insertFirst(12);
        dll.printDLLForward();*/
        // dll.printDLLBackward();

        dll.insertLast(1);
        dll.insertLast(2);
        dll.insertLast(3);
        dll.insertLast(4);
        dll.insertLast(5);

        dll.printDLLForward();
        dll.printDLLBackward();
        System.out.println("----------------------------------------");
        // dll.deleteFirst();
        //dll.printDLLForward();
        // dll.deleteFirst();
        // dll.deleteFirst();
        dll.deleteLast();
        dll.printDLLForward();
    }
}
