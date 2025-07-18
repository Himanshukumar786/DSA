package Graph.TopologicalSort;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public static ArrayList<Integer> topoSort(int V, int[][] edges) {
        
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int[] inDegree = new int[V];
        Queue<Integer> q = new LinkedList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        
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
        
        while(!q.isEmpty()){
            int node = q.poll();
            ans.add(node);
            
            for(int v : adj.get(node)){
                inDegree[v]--;
                
                if(inDegree[v] == 0){
                    q.offer(v);
                }
            }
        }
        return ans;
    }
}
