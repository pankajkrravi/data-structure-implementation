package com.ds.algorithms.recursion;

/**
 * @Author pankaj
 * @create 4/16/21 4:26 PM
 */
public class factorialOfNth {
    public static void main(String[] args) {
   System.out.println(factorial(5));
    }
    // factorial
    public static int factorial(int number)
    {
        int factResult;
        if(number==0)
            return 1;
        else
            factResult= number*factorial(number-1);
        return factResult;
    }
}
