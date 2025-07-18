package Graph.cycleDetection;

import java.util.ArrayList;

class Solution {
    private boolean isCycleDFS(ArrayList<ArrayList<Integer>> adjList, int u, boolean[] visited, boolean[] inRecursion) {
        visited[u] = true;
        inRecursion[u] = true;

        for (int v : adjList.get(u)) {
            if (!visited[v]) {
                if (isCycleDFS(adjList, v, visited, inRecursion)) {
                    return true;
                }
            } else if (inRecursion[v]) {
                return true;
            }
        }

        inRecursion[u] = false;
        return false;
    }

    public boolean isCyclic(int V, int[][] edges) {
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adjList.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            adjList.get(u).add(v); // directed edge from u to v
        }

        boolean[] visited = new boolean[V];
        boolean[] inRecursion = new boolean[V];

        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                if (isCycleDFS(adjList, i, visited, inRecursion)) {
                    return true;
                }
            }
        }

        return false;  
    }
}
