package com.ds.algorithms.TimeCXomplexity.TcOfLinearAlgo;

/**
 * @Author pankaj
 * @create 4/14/21 5:01 PM
 */
public class SumofnNumber {
    public static void main(String[] args) {
        double now=System.currentTimeMillis();
        int number=500000;
        //System.out.println(findSumOfNumber(number));
       // System.out.println(System.currentTimeMillis()- now);
        System.out.println(findSumOfNum(number));
        System.out.println(System.currentTimeMillis()- now);
    }
    // sol ----------1
    private static int findSumOfNumber(int number) {
        return number*(number+1)/2;
    }
    // sol  -------------------- 2
    private static int findSumOfNum(int number) {
         int sum=0; // 1 step
         for (int i=0;i<=number;i++)
         {
             sum+=i; //n steps
         }
         return sum;
    }

}
// Time complexity of Linear Algorithm = O(n)