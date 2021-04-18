package com.ds.algorithms.tree.binaryTree;

/**
 * @Author pankaj
 * @create 4/17/21 2:23 PM
 */
public class TestBinaryTree {
    public static void main(String[] args) {
        BinaryTree binaryTree=new BinaryTree();
        binaryTree.createBinaryTree();
        //binaryTree.preOrder(binaryTree.root);
        //binaryTree.preOrderIterative();

        //System.out.println();
        //binaryTree.inOrder(binaryTree.root);

       // binaryTree.inOrderIterative(binaryTree.root);
        /*System.out.println("------------ postOrder using recursion -----------");
        binaryTree.postOrder(binaryTree.root);
        */
       /* System.out.println("------------ postOrder using iterative -----------");
        binaryTree.postOrderIterative();*/
        binaryTree.levelOrder();
    }
}
