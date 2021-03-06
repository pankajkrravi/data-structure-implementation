package com.ds.algorithms.tree.binaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @Author pankaj
 * @create 4/17/21 2:11 PM
 */
public class BinaryTree {
    public TreeNode root;

   public class TreeNode
    {
       public   TreeNode left;
        public TreeNode right;
        public int data;//generic type
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

    // =================== post order traversal using recursion ==============
    public void postOrder(TreeNode root)
    {
        if (root ==null)
        {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }
    // ======================= post oder using iterative ==============
    public void postOrderIterative()
    {
        TreeNode current=root;
        Stack<TreeNode> stack=new Stack<>();

        while (current !=null || !stack.isEmpty())
        {
            if (current !=null)
            {
                stack.push(current);
                current=current.left;
            }else {
                TreeNode temp=stack.peek().right;
                if (temp == null) //no right child available
                {
                    temp=stack.pop();
                    System.out.print(temp.data+" ");
                    while (!stack.isEmpty() && temp== stack.peek().right)
                    {
                        temp=stack.pop();
                        System.out.print(temp.data+" ");
                    }
                }else {
                    current=temp;

                }
            }
        }
        System.out.println();
    }
     // ================== Level Order traversal ===================
    // offer--> means enqueue operation, poll --> remove
    public void levelOrder(){
        if (root == null)
        {
            return;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty())
        {
            TreeNode temp=queue.poll();
            System.out.print(temp.data+" ");
            if (temp.left != null)
            {
                queue.offer(temp.left);
            }if (temp.right != null)
             {
            queue.offer(temp.right);
           }
        }
    }
}
