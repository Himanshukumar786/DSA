package Graph.TopologicalSort;

import java.util.ArrayList;
import java.util.Stack;

class Solution {
    public static ArrayList<Integer> topoSort(int V, int[][] edges) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        boolean[] visited = new boolean[V];
        Stack<Integer> st = new Stack<>();
        
        for(int i = 0; i < V; i++){
            adj.add(new ArrayList<>());
        }
        
        for(int[] e : edges){
            int u = e[0];
            int v = e[1];
            
            adj.get(u).add(v);
        }
        
        for(int i = 0; i < V; i++){
            if(!visited[i]){
                dfs(adj, visited, i, st);
            }
        }
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        while (!st.isEmpty()) {
            ans.add(st.pop());
        }
        
        return ans;
    }
    
    public static void dfs(ArrayList<ArrayList<Integer>> adj, boolean[] visited, int node, Stack<Integer> st){
        visited[node] = true;
        
        for(int v : adj.get(node)){
            if(!visited[v]){
                dfs(adj, visited, v, st);
            }
        }
        
        st.push(node);
    }
}
