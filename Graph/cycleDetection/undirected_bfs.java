package Graph.cycleDetection;

import java.util.*;

public class undirected_bfs {

    public boolean isCycle(int V, int[][] edges) {
        ArrayList<List<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];

            adj.get(u).add(v);
            adj.get(v).add(u); // because it's an undirected graph
        }

        boolean[] visited = new boolean[V];

        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                if (bfs(i, adj, visited)) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean bfs(int start, ArrayList<List<Integer>> adj, boolean[] visited) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{start, -1}); // [node, parent]
        visited[start] = true;

        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int node = curr[0];
            int parent = curr[1];

            for (int neighbor : adj.get(node)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.offer(new int[]{neighbor, node});
                } else if (neighbor != parent) {
                    // A visited neighbor not equal to parent indicates a cycle
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        undirected_bfs sol = new undirected_bfs();

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

