import javax.swing.tree.TreeNode;
import java.util.LinkedList;
import java.util.Queue;

public class CountCompleteTreeNodes {
    /* #222, Tree, Easy , 2023-08-30 */
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode() {}
     *     TreeNode(int val) { this.val = val; }
     *     TreeNode(int val, TreeNode left, TreeNode right) {
     *         this.val = val;
     *         this.left = left;
     *         this.right = right;
     *     }
     * }
     */
    class Solution {
        public int countNodes(TreeNode root) {
            if(root == null) return 0;
            TreeNode left = root.left;
            TreeNode right = root.right;
            int cnt = 1;

            Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(root);

            while(queue.size() > 0){
                TreeNode tn = queue.poll();

                if(tn.left != null){
                    queue.offer(tn.left);
                    cnt++;
                }
                if(tn.right != null){
                    queue.offer(tn.right);
                    cnt++;
                }
            }

            return cnt;
        }
    }

    public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode() {}
          TreeNode(int val) { this.val = val; }
          TreeNode(int val, TreeNode left, TreeNode right) {
              this.val = val;
              this.left = left;
              this.right = right;
          }
    }
}
