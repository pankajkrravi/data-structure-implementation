package com.ds.algorithms.linkedlist.customImplement;

/**
 * @Author pankaj
 * @create 4/11/21 6:25 PM
 */
public class LinkedList {
    Node head;// first Node

    public void add(int data) {
        // create Node before add it to LL
        Node node=new Node();
        node.data=data;
        node.next=null;
        // if you are adding first node, List is empty
        if (head == null)
        {
            head=node;
        }
         // if head(first node is already added
        else {
                Node travers=head;// to traverse Node, to hold temp data
            while (travers.next!=null)
            {
                travers=travers.next;// going to next node
            }
            // after reaching to last node
            travers.next=node;// newly created Node is pointing
        }
    }

    // display method
    public void display()
    {
        Node node=head;
        while (node.next !=null)
        {
            System.out.print(node.data+" -> ");
            node=node.next;// going to next node
        }
        System.out.print(node.data); // print last Node
    }
}
