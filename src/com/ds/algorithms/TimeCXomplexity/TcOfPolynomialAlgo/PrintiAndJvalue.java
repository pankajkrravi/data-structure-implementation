package com.ds.algorithms.TimeCXomplexity.TcOfPolynomialAlgo;

/**
 * @Author pankaj
 * @create 4/15/21 3:30 PM
 */
public class PrintiAndJvalue {
    public static void main(String[] args) {
        print(3);
    }
     public static void print(int n)
     {
         for (int i=1;i<=n;i++)
         {
             for (int j=1;j<=n;j++)
             {
                 System.out.println("i = "+i+" j = "+j);
             }
             System.out.println("  ::::::: inner for Loop End ::::");
         }
         System.out.println(" !!!!!! Outer for Loop End !!!!!!!!");
     }
}
// Tc=O(n2)