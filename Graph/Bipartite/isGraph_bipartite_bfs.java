package Graph.Bipartite;
import java.util.*;

class Solution {
    public boolean isBipartite(int V, int[][] edges) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < V; i++) adj.add(new ArrayList<>());

        for(int[] edge : edges){
            int u = edge[0];
            int v = edge[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        int[] color = new int[V];
        Arrays.fill(color, -1);

        for(int i = 0; i < V; i++){
            if(color[i] == -1){
                if(!bfs(i, adj, color)) return false;
            }
        }
        return true;
    }

    public boolean bfs(int start, ArrayList<ArrayList<Integer>> adj, int[] color){
        
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        color[start] = 0;  

        while(!queue.isEmpty()){
            int node = queue.poll();
            
            for(int neighbor : adj.get(node)){
                
                if(color[neighbor] == -1){
                    color[neighbor] = 1 - color[node];  
                    queue.offer(neighbor);
                } else if(color[neighbor] == color[node]){
                    return false;  
                }
            }
        }
        
        return true;
    }
}
