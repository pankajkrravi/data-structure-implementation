package com.ds.algorithms.tree.practiceBinaryTree;

import com.ds.algorithms.tree.binaryTree.BinaryTree;

/**
 * @Author pankaj
 * @create 4/18/21 1:01 PM
 */
//How to find Maximum value in a Binary Tree? (Recursive)
public class MaxValueInBT {

    public static int findMaxValue(BinaryTree.TreeNode root)
    {
        if (root ==null)
        {
            return Integer.MIN_VALUE;
        }
        int result=root.data;
        int left=findMaxValue(root.left);
        int right=findMaxValue(root.right);
        if (left>result){
            result= left;
        } if (right>result) {
        result= right;
         }
        return result;
    }

    public static void main(String[] args) {
        BinaryTree binaryTree=new BinaryTree();
        binaryTree.createBinaryTree();
         int maxValue= findMaxValue(binaryTree.root);
         System.out.print("Max Value from Binary Tree = "+maxValue);
    }
}
