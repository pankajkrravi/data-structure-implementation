package com.ds.algorithms.searching.linearSearch;

/**
 * @Author pankaj
 * @create 4/19/21 3:37 PM
 */// Note"  Binary Search works on sorted items !!!
public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {1,17,78,450,600,700,740,800};
        System.out.println(binarySearch(arr,600));
    }
     public static int binarySearch(int[] arr,int searchValue)
     {
         int start=0;
         int end=arr.length-1;
         while (start<=end) {
             int middle = (start + end) / 2;
             if(searchValue == arr[middle])
             {
                 return middle;
             } else  if (searchValue < arr[middle])
             {
                 end= middle-1;
             } else {
                 start= middle +1;
             }
         }
         return -1;
     }
}
