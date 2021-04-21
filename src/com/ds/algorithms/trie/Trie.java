package com.ds.algorithms.trie;

/**
 * @Author pankaj
 * @create 4/21/21 5:01 PM
 */
public class Trie {
        TrieNode root;
        Trie() {
           root = new  TrieNode(); // root is Empty
        }
    private class TrieNode {
        private TrieNode[] children;
        private boolean isWord;

        public TrieNode() {
            //initialize array with 26, to store all alphabets[a-z]
            this.children = new TrieNode[26];
            this.isWord = false;
        }
    }
     // ============= insert ==============
        public void insert(String word)
        {
            if (word ==null || word.isEmpty())
            {
                throw new IllegalArgumentException("Invalid input");
            }
            word=word.toLowerCase();

            TrieNode  current=root;
            for (int i=0;i< word.length();i++)
            {
                char c=word.charAt(i);
                int index= c-'a'; // give index position
                if (current.children[index] == null) {
                        TrieNode node=new TrieNode();
                        current.children[index] = node;
                        current= node;
                } else {
                    current= current.children[index];
                }
            }
            current.isWord= true;
        }
}
