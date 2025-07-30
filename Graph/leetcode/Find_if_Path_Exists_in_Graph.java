package Graph.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Find_if_Path_Exists_in_Graph {
    class Solution {
        public boolean validPath(int n, int[][] edges, int source, int destination) {
            List<List<Integer>> adj = new ArrayList<>();
            boolean[] visited = new boolean[n];

            for (int i = 0; i < n; i++) {
                adj.add(new ArrayList<>());
            }

            for (int[] edge : edges) {
                int u = edge[0];
                int v = edge[1];

                adj.get(u).add(v);
                adj.get(v).add(u);
            }
            return dfs(adj, visited, source, destination);
        }

        public boolean dfs(List<List<Integer>> adj, boolean[] visited, int source, int desti) {
            if (source == desti) {
                return true;
            }

            visited[source] = true;

            for (int neigh : adj.get(source)) {
                if (!visited[neigh] && dfs(adj, visited, neigh, desti)) {
                    return true;
                }
            }
            return false;
        }
    }
}
