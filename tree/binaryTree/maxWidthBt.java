package tree.binaryTree;

import java.util.LinkedList;
import java.util.Queue;

import javax.swing.tree.TreeNode;

public class maxWidthBt {
    class Solution {
        class Pair {
            TreeNode node;
            int index;

            Pair(TreeNode node, int index) {
                this.node = node;
                this.index = index;
            }
        }

        public int widthOfBinaryTree(TreeNode root) {
            Queue<Pair> q = new LinkedList<>();
            q.offer(new Pair(root, 0));
            int maxWidth = 0;

            while (!q.isEmpty()) {
                int size = q.size();
                int minIdx = q.peek().index;
                int firstNodeIdx = 0, lastNodeIdx = 0;

                for (int i = 0; i < size; i++) {
                    int currIdx = q.peek().index - minIdx;
                    TreeNode currNode = q.poll().node;

                    if (i == 0) firstNodeIdx = currIdx;
                    if (i == size - 1) lastNodeIdx = currIdx;

                    if (currNode.left != null) {
                        q.offer(new Pair(currNode.left, 2 * currIdx + 1));
                    }
                    if (currNode.right != null) {
                        q.offer(new Pair(currNode.right, 2 * currIdx + 2));
                    }
                }

                int currWidth = lastNodeIdx - firstNodeIdx + 1;
                maxWidth = Math.max(maxWidth, currWidth);
            }

            return maxWidth;
        }
    }
}
