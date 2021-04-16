package com.ds.algorithms.stack;

import java.util.EmptyStackException;

/**
 * @Author pankaj
 * @create 4/16/21 9:42 PM
 */
public class Stack {
    private Node top;// to perform operation(pop/push)
    private int length;//represent size of Stack

    class Node{
        private int data;
        private Node next;
        Node(int data)
        {
            this.data=data;
        }
    }
    Stack()
    {
        top=null;
        length=0;
    }
    //============ length ==============
    public int length()
    {
        return length;
    }
     //================ isEmpty ==================
    public boolean isEmpty()
    {
        return length==0;
    }
    //================== PUSH ============
    public void push(int data)
    {
        Node temp=new Node(data);
           temp.next=top;
           top=temp;
           length++;
    }
    // ============= pop =============
    public int pop()
    {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        int result=top.data;
        top=top.next;
        length--;
        return result;
    }
     // ==================== peak - return last inserted Node into Stack =================
    public int peek()
    {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return top.data;
    }
     // ================== print Stack ========================
    public void printStack()
    {
        if (isEmpty())
        {
            throw new EmptyStackException();
        }else {
            while (top != null) {
                System.out.print(top.data+" ");
                top = top.next;
            }
        }
    }
}
