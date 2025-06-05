package Graph.cycleDetection;

import java.util.*;

public class undirected_dfs {
    public boolean isCycle(int V, int[][] edges) {
        ArrayList<List<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];

            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        boolean[] visited = new boolean[V];
        for (int i = 0; i < V; i++) {
            if (!visited[i] && dfs(adj, visited, i, -1)) {
                return true;
            }
        }

        return false;
    }

    public boolean dfs(ArrayList<List<Integer>> adj, boolean[] visited, int node, int parent) {
        visited[node] = true;

        for(int neighbour : adj.get(node)){
            if(neighbour == parent) continue;
            
            if(visited[neighbour] == true) return true;
            
            if(dfs(adj, visited, neighbour, node)){
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        undirected_dfs sol = new undirected_dfs();

        int V = 5;
        int[][] edges = {
            {0, 1},
            {1, 2},
            {2, 3},
            {3, 4},
            {4, 1}  // This creates a cycle
        };

        boolean hasCycle = sol.isCycle(V, edges);
        System.out.println("Does the graph contain a cycle? " + hasCycle);
    }
}

