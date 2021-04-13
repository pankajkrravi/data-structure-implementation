package com.ds.algorithms.linkedlist.CircularSLL;

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
          if(last !=null)
        {
            System.out.println("check if Circular LL Last == null !!!!!!!!!!!!!");
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
}
