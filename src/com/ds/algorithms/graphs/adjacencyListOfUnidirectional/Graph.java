package com.ds.algorithms.graphs.adjacencyListOfUnidirectional;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

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
    // ============ Breadth First Search(BFS)--> traverse the graph Level Bu level =============
     public void bfs(int source) {
        // Track the visited nodes
         boolean[] visited=new boolean[V];
         Queue<Integer> q=new LinkedList<>();
         visited[source] =true;
         q.offer(source);

         while (!q.isEmpty())
         {
             int u=q.poll();
             System.out.print(u+" ");
             // traverse adjacency Nodes
             for (int v : adj[u]) {
                if (!visited[v])
                {
                    visited[v]= true;
                    q.offer(v);
                }
             }
         }
     }
      // ============== DFS =================
        public void dfs(int s)
        {
            boolean[] visited=new boolean[V];
            //to perform DFS
            Stack<Integer> stack=new Stack<>();
        stack.push(s);
        while (!stack.isEmpty())
        {
            int u=stack.pop();
            // check whether we visited u or not
            if (!visited[u])
            {
                visited[u] = true;
                System.out.print(u+" ");
                for (int v: adj[u]){ // get all the adjency node and iterate it
            if (!visited[v])
            {
                stack.push(v);
            }
                }
            }
        }
        }
        // ============= main test Code =========
        public static void main(String[] args) {
            Graph graph=new Graph(5);
            graph.addEdge(0,1);
            graph.addEdge(1,2);
            graph.addEdge(2,3);
            graph.addEdge(3,0);
            graph.addEdge(2,4);
            graph.bfs(0);
            //System.out.println(graph);
            System.out.println("========== DFS =========");
            graph.dfs(0);
        }
}
