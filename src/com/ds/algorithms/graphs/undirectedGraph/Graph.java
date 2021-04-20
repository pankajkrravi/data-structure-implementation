package com.ds.algorithms.graphs.undirectedGraph;

/**
 * @Author pankaj
 * @create 4/19/21 6:38 PM
 */
public class Graph {
    private int V;//no of vertices in Graph
    private int E;//no of Edges of Graph
   private int [][] adjMatrix;

    public Graph(int nodes)
    {
        this.V=nodes;
        this.E =0;
        adjMatrix=new int[nodes][nodes];
    }
    // ================ addEdge ============
    public void addEdge(int u,int v)
    {
        adjMatrix[u][v] = 1;// 1 represent edge
        adjMatrix[v][u] = 1;// because it's an unidirectional graph
        E++;
    }
     // =========== toString ==================
    public String toString()
    {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(V+" Vertices "+ E + " Edges " + "\n");
        for (int v=0;v<V;v++) {
            stringBuilder.append(v+" : ");
            for ( int w: adjMatrix[v])
            {
                stringBuilder.append(w+" ");
            }
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}
