package com.ds.algorithms.queue;

/**
 * @Author pankaj
 * @create 4/17/21 1:00 PM
 */
public class TestQueue {
    public static void main(String[] args) {
        Queue queue= new Queue();
        System.out.println("is Empty = "+ queue.isEmpty());
        queue.enqueue(10);
        queue.enqueue(11);
        queue.enqueue(12);
        queue.enqueue(13);
        queue.enqueue(14);
        queue.enqueue(15);
        queue.printQueue();
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());

        queue.printQueue();
        System.out.println(queue.first());
        System.out.println(queue.last());
    }
}
