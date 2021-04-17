package com.ds.algorithms.tree.binaryTree;

import com.ds.algorithms.tree.Tree;

import java.util.Stack;

/**
 * @Author pankaj
 * @create 4/17/21 2:11 PM
 */
public class BinaryTree {
     TreeNode root;

    class TreeNode
    {
        private TreeNode left;
        private TreeNode right;
        private int data;//generic type
        TreeNode(int data)
        {
            this.data= data;
        }
    }
     //  ============= create Binary tre ================
    public void createBinaryTree()
    {
        TreeNode first=new TreeNode(9);
        TreeNode second=new TreeNode(2);
        TreeNode third=new TreeNode(3);
        TreeNode forth=new TreeNode(4);


        root=first;
            first.left=second;
            first.right=third;// second < ---- first ------ > third

           second.left=forth;
    }
     // ============== Recursive pre-order traversal ====================
    public void preOrder(TreeNode root){
        if(root ==null)
        {
            return;// base case
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    // ============== iterative pre-order tree-traversal ===============
    public void preOrderIterative()
    {
        if (root == null)
        {
            return;
        }
        Stack<TreeNode> stack=new Stack<>();
        stack.push(root);

        while (!stack.isEmpty())
        {
             TreeNode temp=stack.pop();
            System.out.print(temp.data+" ");
            if (temp.right !=null)
            {
                stack.push(temp.right);
            }if (temp.left !=null) {
            stack.push(temp.left);
        }
        }
    }
    // =================== Recursive in Order traversal ===============
    public void inOrder(TreeNode root)
    {
        if(root == null)
        {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    // ============= iterative inOrder =============
    public void inOrderIterative(TreeNode root) {
        if (root == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode temp = root;

        while (!stack.isEmpty() || temp != null){
            if (temp !=null)
            {
                stack.push(temp);
                temp=temp.left;
            }else {
                temp=stack.pop();
                System.out.print(temp.data+" ");
                temp=temp.right;
            }
        }

    }
}
