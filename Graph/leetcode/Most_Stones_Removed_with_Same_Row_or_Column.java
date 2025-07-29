package Graph.leetcode;

public class Most_Stones_Removed_with_Same_Row_or_Column {
    class Solution {
        int n;

        public int removeStones(int[][] stones) {
            n = stones.length;
            int count = 0;
            boolean[] visited = new boolean[n];

            for (int i = 0; i < n; i++) {
                if (visited[i] == true)
                    continue; // skip
                dfs(stones, i, visited);
                count++; // connected component

            }
            return n - count;
        }

        public void dfs(int[][] stones, int index, boolean[] visited) {
            visited[index] = true;
            int r = stones[index][0];
            int c = stones[index][1];

            for (int i = 0; i < n; i++) {
                if (!visited[i] && (stones[i][0] == r || stones[i][1] == c)) {
                    dfs(stones, i, visited);
                }
            }
        }
    }
}
