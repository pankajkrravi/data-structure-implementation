package com.ds.algorithms.queue;

import java.util.NoSuchElementException;

/**
 * @Author pankaj
 * @create 4/17/21 12:20 PM
 */
// Note: Queue Internally uses List Node ==> LinkedList

public class Queue {
    private ListNode front;
    private ListNode rear;
    private int length;

    private class ListNode{
        private ListNode next;
        private int data;
        ListNode(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
      Queue()
      {
          this.front=null;
          this.rear=null;
          this.length=0;
      }

    // ================ length =============
    public int length()
    {
        return length;
    }
    // =========== isEmpty =================
    public boolean isEmpty()
    {
        return length==0;
    }
    // =================== insert element  ==============
        public void enqueue(int data)
        {
            ListNode temp=new ListNode(data);
            if(isEmpty())
            {
                front=temp;
            }else {
                rear.next=temp;// create link
            }
            rear=temp;
            length++;
        }
        // =============== print ==============
    public void printQueue()
    {
        if (isEmpty())
        {
            return;
        }
        ListNode temp= front;
        int printData=temp.data;
        {
            while (temp !=null)
            {
                System.out.print(temp.data+" --> ");
                temp=temp.next;
            }
            System.out.println("null");
        }
    }
    //========== deQueue ===========================
    public int deQueue()
    {
        if (isEmpty())
        {
            throw new NoSuchElementException("Queue is Already Empty !!!!!!!!!!!");
        }
            int result=front.data;
           front=front.next;
           if(front == null) // beak both links(front and rear)
           {
               rear = null;
           }
           length--;
            return result;
    }
     // =============== first - value stored in frond data ====================
    public int first()
    {
        if (isEmpty())
        {
            throw new NoSuchElementException(" #### Queue is already empty #### ");
    }
        return front.data;
    }

    // =============== last - value stored in rear data ====================
    public int last()
    {
        if (isEmpty())
        {
            throw new NoSuchElementException(" #### Queue is already empty #### ");
        }
        return rear.data;
    }
}
