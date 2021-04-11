package com.ds.algorithms.linkedlist;

/**
 * @Author pankaj
 * @create 4/11/21 5:16 PM
 */
  /* LL is a linear DS, WHERE DATA IS stored in non consecutive location
  Adv:
  Insertion and deletion is easy in LL
  LL is of Dynamic size
  Random access(Binary search) of element is not possible, Only sequential access is possible in LL
  TC for searching is O(n) in worst Case


  * */
public class LinkedListImlp {
    public static void main(String[] args) {
        LinkedList linkedList=new LinkedList();
        linkedList.append(123);
        linkedList.append(45554);
        linkedList.prepend(10);
        linkedList.deleteValue(45554);
        System.out.println(linkedList);
    }

}
  class Node{
    Node next;
    int data;
    Node(int data)
    {
        this.data=data;
    }
  }

  class LinkedList{
    Node head;
    public void append(int data)
    {
        if(head==null) {
            head = new Node(data);
            return;
        }
        Node current=head;
        while (current.next !=null)
        {
            current=current.next;
        }
        current.next=new Node(data);
    }
     public void prepend(int data)
     {
         Node newHead=new Node(data);
         newHead.next=head;
         head=newHead;
     }
     public void deleteValue(int data)
     {
         if(head== null)
         return;
         // if we want to delete head value
         if(head.data==data)
         {
             head=head.next;
             return;
         }
         Node current=head;
            while (current.next !=null)
            {
               if(current.next.data== data) {
                   current.next=current.next.next;
                   return;
               }
               current=current.next;
            }
     }
  }