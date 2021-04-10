package com.pankaj.ds.impl.array;

import java.util.Scanner;

/**
 * @Author pankaj
 * @create 4/10/21 11:44 AM
 *
 In java multi dimensional array is  implemented as array os arrays concept or jagged array
 Note: In multidimensional array we must need to specify base size, and remaining can be ignored.
 */
public class ImplementThreeDArray {
    public static void main(String[] args) {
         /* #######################################
         int [][][] threeDArray =new int[2][][];
        threeDArray[0] =new int[3][];
        threeDArray[0][0]=new int[1];
        threeDArray[0][1]=new int[2];
        threeDArray[0][2]=new int[3];

        threeDArray[1]=new int[2][2];
        #############################################*/

        Scanner scanner=new Scanner(System.in);
        System.out.println("Plz Enter base siz 3D Array");
        int basSize1=scanner.nextInt();
        System.out.println("Plz Enter base size of  2D Array");
        int basSize2=scanner.nextInt();
        System.out.println("Plz Enter base size of  1D Array");
        int basSize3=scanner.nextInt();
      //create 3 D array
      int [][][] threeDArray=new int[basSize1][basSize2][basSize3];
      System.out.println("Please Enter all "+basSize1*basSize2*basSize3 +" values foe 3 D Array !!!!");
      for (int i=0;i<basSize1;i++)
      {
          for (int j=0;j<basSize2;j++)
          {
              for (int k=0;k<basSize3;k++)
              {
                  threeDArray[i][j][k]=scanner.nextInt();
              }
          }
      }
       // call method to print values
        printThreeDArray(threeDArray);
    }

     public static  void printThreeDArray(int [][][] array)
     {

        /* for (int i=0;i<array.length;i++)
         {
             for (int j=0;j<array[i].length;j++)
             {
                 for ( int k=0;k<array[i][j].length;k++)
                 {
                     System.out.print(array[i][j][k] + " ");
                 }
             }
             System.out.println();
         } */
         for( int [][] i:array)
         {
             for(int [] j: i)
             {
                 for( int k: j)
                 {
                     System.out.print(k+" ");
                 }
                 System.out.println();
             }
             System.out.println();
         }
     }
}
