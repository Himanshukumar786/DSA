package Graph.Traversal;
import java.util.ArrayList;

public class Dfs { // GFG question
    class Solution {
    
        public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
            int n = adj.size();
            boolean[] visited = new boolean[n];
            ArrayList<Integer> ans = new ArrayList<>();
            
            dfs(0, adj, visited, ans);
            return ans;
        }
        
        public void dfs(int node, ArrayList<ArrayList<Integer>> adj, boolean[] visited, ArrayList<Integer> ans){
            visited[node] = true;
            ans.add(node);
            
            for(int neighbour : adj.get(node)){
                if(visited[neighbour] == false){
                    dfs(neighbour, adj, visited, ans);
                }
            }
        }
    }
}
