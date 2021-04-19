package com.ds.algorithms.graphs.undirectedGraph;

/**
 * @Author pankaj
 * @create 4/19/21 6:44 PM
 */
public class TestUndirectedGraph {
    public static void main(String[] args) {
        Graph graph=new Graph(4);
        graph.addEdge(0,1);
        graph.addEdge(1,2);
        graph.addEdge(2,3);
        graph.addEdge(3,0);

    }
}
