package com.ds.algorithms.binaryHeap;

/**
 * @Author pankaj
 * @create 4/18/21 5:58 PM
 */
     //Note binary Heap internally uses Arrays.
    // Max Priority Queue is nothing but Max heap.
    // implement Max Heap in Java
public class MaxPQ {
    //int has default values which may interfere with heap properties
     Integer [] heap; // Using integer o/p:- null 5 4 3 2 1 null null,But using int o/p:- 0 5 4 3 2 1 0 0
        int n;
        public MaxPQ(int capacity)
        {
            heap= new Integer[capacity+1];
            n= 0;
        }
        //=========== isEmpty =============
    public boolean isEmpty()
    {
        return n==0;
    }
    //================= size =============
    public int size()
    {
        return n;
    }
     // =========== insert() ===========
    public void insert(int x)
    {
        if (n == heap.length-1) {//heap is full
            resize(2*heap.length);
        }
        n++;
        heap[n]=x;
        //perform Bottom-Up heapify
        swim(n);
    }
    private void swim(int k) {
        while (k> 1 && heap[k/2] < heap[k]){ //k/2 will give parent value
                int temp=heap[k];
                heap[k] = heap[k/2];
                heap[k/2] = temp;
                k=k/2;// to continue shifting up till new value inserted at correct position

        }
    }
    public void resize(int capacity)
    {
        Integer [] temp=new  Integer[capacity];
        for (int i=0;i<heap.length;i++)
        {
            temp[i] = heap[i];
        }
        heap=temp;// twice of heap size, array is created and copied, again assign it to heap
    }
    // =========== print max Heap ============
    public void printMaxHeap()
    {
        for (int i=1;i<=n;i++ ){ // starting from index 1 becoz 0th index is empty
            System.out.print(heap[i]+" ");
        }
    }
}
