package com.ds.algorithms.TimeCXomplexity.TcOfConstantAlgo;

/**
 * @Author pankaj
 * @create 4/15/21 1:53 PM
 */
public class CalculateSumOfTwoNumber {
    public static void main(String[] args) {

    }
     // method to calculate sum of 2 numbers
    public int calSumOfTwoNum(int x,int y)
    {
        int sum=x+y;
        return sum; // TC = 4+2=6 ==> T(Constant) ==> O(1)
    }
    // get specific indexed data from Array
    public int get(int [] arr,int index)
    {
        return arr[index];// TC= O(1)
    }
}
