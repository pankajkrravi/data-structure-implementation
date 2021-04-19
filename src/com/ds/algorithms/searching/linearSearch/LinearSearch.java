package com.ds.algorithms.searching.linearSearch;

/**
 * @Author pankaj
 * @create 4/19/21 3:38 PM
 */
// Linear Search in Java | Searching Algorithm
public class LinearSearch {
    public int search(int[] arr,int n, int searchValue)
    {
        for (int i=0;i<n;i++)
        {
            if (arr[i] == searchValue)
            {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] ={1,8,90,12,54,87,36,78};
        LinearSearch searchAlgo=new LinearSearch();
        System.out.println(searchAlgo.search(arr,8,7800));
    }
}
