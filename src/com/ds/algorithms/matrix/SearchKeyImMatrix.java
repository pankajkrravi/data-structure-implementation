package com.ds.algorithms.matrix;

/**
 * @Author pankaj
 * @create 4/18/21 4:45 PM
 */
// Search in a row and column wise sorted matrix.
// ============== Search a key in a given matrix ===============
public class SearchKeyImMatrix {

    public static void searchInSortedMatrix(int [][] matrix,int n,int value)
    {
        int i=0;
        int j=n-1;

        while (i<n && j>=0)
        {
            if (matrix[i][j] == value) {
                System.out.println(value+" found at : "+i+" , "+j);
                return;
            }
            if (matrix[i][j] > value){
                j--;
            }else {
                i++;
            }
        }
        System.out.println(value+" Not Found !!! ");
    }

    public static void main(String[] args) {
        int [][] sortedMatrix={
                {10,20,30,40},
                {15,25,35,45},
                {27,29,37,48},
                {32,33,39,51}
        };
        searchInSortedMatrix(sortedMatrix,4,51);
        searchInSortedMatrix(sortedMatrix,4,208);

    }
}
