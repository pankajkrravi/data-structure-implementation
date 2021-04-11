package com.ds.algorithms.array;

/**
 * @Author pankaj
 * @create 09/04/21 5:51 PM
 */
public class ImplementTwoDArray {
    public static void main(String[] args) {
        //way 1
        int [][] empSalary={
                //emp sal department wise,sales,testing,dev
            //    1      1   3    4     5
                {44444,654,897,896347,7478456},
                {5845,34,234,3645,876,78687,4545,435535},
                {56645566,654646,4564666,12578,45564,3434,34435,5342,234}
        };
        // print all emp salary
        System.out.println("+++++++++++++ print all emp salary ++++++++++++++++");
          printTwoDArray(empSalary);
        // way 2
            int [][] twoDArray=new int[3][4];
            // 3 one D array with  4 elements
        System.out.println("========== print 2d array with default values==========");
            printTwoDArray(twoDArray);

    }
    public static void printTwoDArray(int [][] array){
        for (int i = 0; i < array.length; i++) // 0 to 2
        {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
