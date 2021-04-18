package com.ds.algorithms.tree.binarySearchTree;

/**
 * @Author pankaj
 * @create 4/18/21 2:57 PM
 */
public class BinarySearchTree {
        TreeNode root;
    private class TreeNode {
        private int data;//Generic type
        private TreeNode left;
        private TreeNode right;
        public TreeNode(int data)
        {
            this.data=data;
        }
    }
     // ========= insert value in BST using recursion ================
    public  void insert(int value){
        root=insert(root,value);//calling internally
    }
        public TreeNode insert(TreeNode root,int value) {
            if (root == null) // base case
            {
                root = new TreeNode(value);
                return root;
            }
            if (value < root.data) {
                root.left = insert(root.left, value);
            } else{
                root.right = insert(root.right, value);
                }
            return root;
        }

        //================ print inOrder BST ====================
    public void inOrder() {
        inOrder(root);
    }
    public void inOrder(TreeNode root) {
        if (root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);

    }
}