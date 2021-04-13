package com.ds.algorithms.linkedlist.CircularSLL;

import java.util.NoSuchElementException;

/**
 * @Author pankaj
 * @create 4/13/21 1:13 PM
 */
public class CircularSinglyLinkedList {
        private NodeCircular last;
        private int length;

    private  class NodeCircular
    {
        private NodeCircular next;
        private int data;
        NodeCircular(int data)
        {
            this.data=data;
        }
    }
     CircularSinglyLinkedList()
     {
         last=null;
         length=0;
     }
     // Length()
    public int length()
    {
        return length;
    }
    //isEmpty()
    public boolean isEmpty()
    {
        return length==0;
    }
   // createVCircularSinglyLinkedList
    public void createCircularSinglyLinkedList()
    {
        NodeCircular nodeFirst=new NodeCircular(1);
        NodeCircular nodeSecond=new NodeCircular(2);
        NodeCircular nodeThird=new NodeCircular(3);
        NodeCircular nodeForth=new NodeCircular(4);
        NodeCircular nodeFifth=new NodeCircular(5);
        NodeCircular nodeSixth=new NodeCircular(6);
        // create Link
        nodeFirst.next=nodeSecond;
        nodeSecond.next=nodeThird;
        nodeThird.next=nodeForth;
        nodeForth.next=nodeFifth;
        nodeFifth.next=nodeSixth;
        nodeSixth.next=nodeFirst;//----------
        last=nodeSixth;
    }

    // print Circular SLL
    public void printCircularSLL()
    {
        // check if Circular SLL pointing to  null
          if(last ==null)
        {
           // System.out.println("check if Circular LL Already Empty");
            return;
        }
        NodeCircular first=last.next;
        while (first !=last)
        {
            System.out.print(first.data+" ");
            first=first.next;
        }
        System.out.println(first.data+" ");
    }
    //-----------insert at first
    public void insertFirst(int data)
    {
        NodeCircular tmp=new NodeCircular(data);
        if(last == null)
        {
            last=tmp;
        }else {
            tmp.next=last.next;
        }
        last.next=tmp;
        length++;
    }
    // ------------------insert Last
    public void insertLast(int data)
    {
        NodeCircular temp=new NodeCircular(data);
        if(last == null) //isEmpty
        {
        last=temp;
         last.next=last;
        }else {
            temp.next=last.next;
            last.next=temp;
            last=temp;
        }
        length++;
    }
    //-----------------remove first ------------------
    public int removeFirst()
    {
        if(isEmpty())
        {
            throw new NoSuchElementException("circular Linked List is already Empty  !!!!!!!!!!");
        }
        NodeCircular temp=last.next;
        int result=temp.data;
        if(last.next == last)//Only one Element is Left
        {
            last=null;
        }else {
            last.next=temp.next;
        }
        //temp.next=null;
        length--;
        return result;// return temp;  --> Node
    }
    // ===================  Remove Last =======================

}
