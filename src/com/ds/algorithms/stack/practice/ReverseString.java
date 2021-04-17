package com.ds.algorithms.stack.practice;

import java.util.Stack;

/**
 * @Author pankaj
 * @create 4/17/21 11:59 AM
 */
// How to reverse a String using Stack
public class ReverseString {
    //step1. create Stack
    //step 2. push element
    //step 3. print element one by one using pop method
    //step 3. print element one by one using pop method
    public String reverseStringUsingStack(String str) {
        Stack<Character> stack = new Stack<>();
        char[] charStr = str.toCharArray();
        for (int i=0;i<charStr.length;i++)
        {
            stack.push(charStr[i]);
        }
        for (int j=0;j<charStr.length;j++)
        {
            charStr[j] = stack.pop();
        }
        return new String(charStr);
    }
    //=============  test the logic =======================
    public static void main(String[] args) {
        ReverseString reverseString=new ReverseString();
        String str="ABCDEFGH";
        System.out.println("Before Reverse "+str);
        System.out.println("After Reverse "+reverseString.reverseStringUsingStack(str));
    }
}
