package Graph.cycleDetection;
import java.util.*;

class Solution {
    public boolean isCyclic(int V, int[][] edges) {

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int[] inDegree = new int[V];
        Queue<Integer> q = new LinkedList<>();
        
        for(int i = 0; i < V; i++){
            adj.add(new ArrayList<>());
        }
        
        for(int[] e : edges){
            int u = e[0];
            int v = e[1];
            
            adj.get(u).add(v);
            inDegree[v]++;
        }
        
        for(int i = 0; i < V; i++){
            if(inDegree[i] == 0){
                q.offer(i);
            }
        }
        
        int count = 0;
        while(!q.isEmpty()){
            int node = q.poll();
            count++;
            
            for(int v : adj.get(node)){
                inDegree[v]--;
                
                if(inDegree[v] == 0){
                    q.offer(v);
                }
            }
        }
        
        return count != V;
    }
}
