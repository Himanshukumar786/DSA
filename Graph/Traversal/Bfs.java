package Graph.Traversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Bfs {
    class Solution {
        public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
            boolean[] visited = new boolean[V];
            ArrayList<Integer> ans = new ArrayList<>();
            
            Queue<Integer> que = new LinkedList<>();
            visited[0] = true;
            que.offer(0);
            
            while(!que.isEmpty()){
                int node = que.poll();
                ans.add(node);
                
                for(int neighbour : adj.get(node)){
                    if(!visited[neighbour]){
                        visited[neighbour] = true;
                        que.offer(neighbour);
                    }
                }
            }
            return ans;
        }
    }
}
