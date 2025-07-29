package Graph.leetcode;

import java.util.*;
// import java.util.Arrays;
// import java.util.HashSet;
// import java.util.LinkedList;
// import java.util.Queue;

public class Minimum_Genetic_Mutation {
    class Solution {
        public int minMutation(String startGene, String endGene, String[] bank) {
            HashSet<String> bankset = new HashSet<>(Arrays.asList(bank));
            HashSet<String> visited = new HashSet<>();
            Queue<String> que = new LinkedList<>();

            que.offer(startGene);
            visited.add(startGene);

            int level = 0;
            char[] gene = { 'A', 'C', 'G', 'T' };

            while (!que.isEmpty()) {
                int size = que.size();

                while (size > 0) {
                    String curr = que.poll();
                    if (curr.equals(endGene)) {
                        return level;
                    }

                    char[] currarray = curr.toCharArray();
                    for (int i = 0; i < currarray.length; i++) {
                        char oldchar = currarray[i];

                        for (char ch : gene) {
                            currarray[i] = ch;
                            String newarray = new String(currarray);

                            if (!visited.contains(newarray) && bankset.contains(newarray)) {
                                que.offer(newarray);
                                visited.add(newarray);
                            }
                        }
                        currarray[i] = oldchar; // restore original character after checking
                    }
                    size--;
                }
                level++;
            }
            return -1;
        }
    }
}
