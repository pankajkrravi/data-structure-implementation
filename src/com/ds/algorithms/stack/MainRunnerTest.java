package com.ds.algorithms.stack;

/**
 * @Author pankaj
 * @create 4/16/21 9:58 PM
 */
public class MainRunnerTest {
    public static void main(String[] args) {
        Stack stack=new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println("Peek = "+stack.peek());
        System.out.println("Pop = "+stack.pop());
        System.out.println("Peek = "+stack.peek());
        System.out.println("Pop = "+stack.pop());
        System.out.println("Peek = "+stack.peek());
        System.out.println("Pop = "+stack.pop());
        stack.printStack();

        }
}
