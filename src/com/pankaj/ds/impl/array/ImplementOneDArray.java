package com.pankaj.ds.impl.array;

import java.util.Scanner;

/**
 * @Author pankaj
 * @create 09/04/21 5:14 PM
 */
public class ImplementOneDArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Plz Enter the Size of Array ???");
        int size=scanner.nextInt();
        //code to create array with size, given by user
        int[] array=new int[size];
        System.out.println("Plz Enter all "+size+" Value to store in Array");
        //code to insert all input element from user
        for (int i=0;i< size;i++)
        {
            array[i]=scanner.nextInt();
        }
        // code to print all arrays element
        System.out.println("All the values stored in Array is Following");
        for (int i=0;i<size;i++)
        {
            System.out.println(array[i]);
        }
    }
}
