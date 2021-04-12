package com.ds.algorithms.linkedlist.SLLcustomImplement;

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
  // add at first
    public void addAtFirst(int data)
    {
        Node node=new Node();
        node.data=data;
        node.next=null;
        node.next=head; // newly created next value will be previous head node
        // change newly created Node to Head
        head=node;
    }

    // addAt index
    public void addAtIndex(int index,int data)
    {
        Node node=new Node();
        node.data=data;
        node.next=null;
        // add Node to 0th index--.> add it to first Location
        if(index==0)
        {
            addAtFirst(data);
        }else {
            Node n = head;
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            node.next = n.next;// change ref, index-1 Node to newly created Node
            n.next = node;
        }
    }
    // delete value
    public void deleteAt(int index)
    {
        if(index==0)
        {
            head=head.next;

        } else {
            Node n=head;
            Node nRef=null;
            for (int i=0;i<index-1;i++) // reach to that specific index
            {
                    n=n.next;
            }
            // store ref of next Node of index element
            nRef=n.next;
            n.next=nRef.next;
            System.out.println("   Deleted : INDEXED  "+ index+"  DATA "+nRef.data);
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
