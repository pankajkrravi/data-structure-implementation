package com.pankaj.ds.impl.array;

/**
 * @Author pankaj
 * @create 09/04/21 6:28 PM
 */
public class AdditionOfTwoDMertices {
    public static void main(String[] args) {
        //array 1
        int [][] array1={
                {2,2,2},
                {3,3,3},
                {4,4,4,}
        };
        //array 2
        int [][] array2={
                {2,2,2},
                {5,5,5},
                {6,6,6,}
        };
        System.out.println("Print array first");
        ImplementTwoDArray.printTwoDArray(array1);
        System.out.println("print array second");
        ImplementTwoDArray.printTwoDArray(array2);
        // create new array to store addition of array
        int [] [] resultArray=new int[array1.length][array1.length];
        // logic for addition
        for (int i=0;i<array1.length;i++)
        {
            for (int j=0;j<array1[i].length;j++)
            {
                resultArray[i][j]=array1[i][j]+array2[i][j];
            }
        }
        // call method to print resultant array
        System.out.println(" ####### Print resultant array #############");
        ImplementTwoDArray.printTwoDArray(resultArray);
    }
}
