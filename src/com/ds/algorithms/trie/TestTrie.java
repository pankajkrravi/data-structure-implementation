package com.ds.algorithms.trie;

/**
 * @Author pankaj
 * @create 4/21/21 5:31 PM
 */
public class TestTrie {
    public static void main(String[] args) {
         Trie trie=new Trie();
         trie.insert("cat");
         trie.insert("cab");
          trie.insert("son");
          trie.insert("so");
          System.out.println("values inserted Successfully !!!");
    }
}
