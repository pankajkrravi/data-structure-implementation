package com.ds.algorithms.linkedlist.DLLImplementation;

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
    // print DLL in Forward Direction
    public void printDLLFoeward()
    {
        if (head==null)
            return;
        Node traverse=head;
        while (traverse !=null)
        {
            System.out.print(traverse.data+" --> ");
            traverse=traverse.next;
        }
        System.out.println("null");
    }
    // print DLL in backward Direction
    public void printDLLBackward()
    {
         if (tail==null)
             return;

        Node traverse=tail;
        while (traverse !=null)
        {
            System.out.print(traverse.data+" --> ");
            traverse=traverse.previous;
        }
        System.out.println("null");
    }

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

    // insertLast

    public void insertLast(int data)
    {
        Node newNode=new Node(data);
        if (isEmpty())
        {
            head=newNode;// head is constant
        } else {
            tail.next=newNode;//--------
        }
        newNode.previous=tail;
        tail=newNode;
        length++;
    }
    public static void main(String[] args) {
        DoublyLinkedList dll=new DoublyLinkedList();
            /*dll.insertLast(1);
            dll.insertLast(2);
            dll.insertLast(3);
            dll.insertLast(4);
            dll.insertLast(5);*/
        dll.insertFirst(0);
        dll.insertFirst(1);
        dll.insertFirst(5);
        dll.insertFirst(7);
        dll.insertFirst(9);
        dll.insertFirst(12);
        dll.printDLLFoeward();
        dll.printDLLBackward();
    }
}
