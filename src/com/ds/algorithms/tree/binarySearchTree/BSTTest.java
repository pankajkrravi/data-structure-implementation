package com.ds.algorithms.tree.binarySearchTree;

import com.ds.algorithms.tree.binaryTree.BinaryTree;

/**
 * @Author pankaj
 * @create 4/18/21 3:11 PM
 */
public class BSTTest {
    public static void main(String[] args) {
        BinarySearchTree binarySearchTree=new BinarySearchTree();
        binarySearchTree.insert(5);
        binarySearchTree.insert(3);
        binarySearchTree.insert(7);
        binarySearchTree.insert(1);
        binarySearchTree.inOrder();
    }
}
