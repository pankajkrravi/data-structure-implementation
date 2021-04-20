package com.ds.algorithms.graphs.adjacencyListOfUnidirectional;

import java.util.LinkedList;

/**
 * @Author pankaj
 * @create 4/20/21 12:49 PM
 */
public class Graph {
    private LinkedList<Integer> [] adj;
    private int V;// no of vertices
    private int E;//no of edges
     public Graph(int nodes)
     {
         this.V = nodes;
         this.E = 0;
         this.adj= new LinkedList[nodes];
         for (int v=0;v<V;v++)
         {
             adj[v]= new LinkedList<>();// creating all vertices
         }
     }
      // =============== add Edge =================
        public void addEdge(int u,int v) {// create link, u to v and v to u
         adj[u].add(v);
         adj[v].add(u);
         E++;
        }
        public String toString(){// to provide String representation og Graph
        StringBuilder sb=new StringBuilder();
        sb.append(V+" vertices "+E+" Edges "+"\n");
        for (int v=0;v<V;v++) {
            sb.append(v+" : ");
            for (int w : adj[v]) {// get LL associated with vertices
                sb.append(w+" ");
            }
            sb.append("\n");// line break
        }
        return sb.toString();
     }

        // ============= main test Code =========
        public static void main(String[] args) {
            Graph graph=new Graph(4);
            graph.addEdge(0,1);
            graph.addEdge(1,2);
            graph.addEdge(2,3);
            graph.addEdge(3,0);
            System.out.println(graph);
        }
}
