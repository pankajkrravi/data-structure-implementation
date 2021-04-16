package com.ds.algorithms.recursion;

/**
 * @Author pankaj
 * @create 4/16/21 4:47 PM
 */
public class FabonacciNumber {
    public static void main(String[] args) {
   System.out.println(fabonacci(6));
    }
     public static int fabonacci(int n)
     {
         if (n >=3)
         // 1,1, 2,3,5
         return fabonacci(n-1)+fabonacci(n-2);
         else
             return 1;
     }
}
