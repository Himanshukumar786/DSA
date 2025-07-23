package Graph.Bipartite;
import java.util.*;

class Solution {
    public boolean isBipartite(int V, int[][] edges) {
    
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int[] color = new int[V];
        Arrays.fill(color, -1);
        
        for(int i = 0; i < V; i++) adj.add(new ArrayList<>());
        
        for(int[] edge : edges){
            int u = edge[0];
            int v = edge[1];
            
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        
        for(int i = 0; i < V; i++){
            if(color[i] == -1 && dfs(adj, color, i, 1) == false){ // 1 -> red, 0 -> green
                return false;
            }
        }
        return true;
    }
    
    public boolean dfs(ArrayList<ArrayList<Integer>> adj, int[] color, int node, int currentcolor){
        color[node] = currentcolor;
        
        for(int v : adj.get(node)){
            if(color[v] == color[node]){
                return false;
            }
            
            if(color[v] == -1){
                int colorofv = 1 - currentcolor;
                
                if(dfs(adj, color, v, colorofv) == false){
                    return false;
                }
            }
        }
        return true;
    }
}
