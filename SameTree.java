import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class SameTree {
    public static class TreeNode {
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
    public boolean isSameTree(TreeNode p, TreeNode q) {

        Queue<TreeNode> queue1 = new LinkedList<>();
        Queue<TreeNode> queue2 = new LinkedList<>();
        queue1.offer(p);
        queue2.offer(q);


        while(queue1.size() > 0){
            TreeNode t1 = queue1.poll();
            if(queue2.size() == 0){
                return false;
            }
            TreeNode t2 = queue2.poll();

            if(t1.val != t2.val || t1.left.val != t2.left.val || t1.right.val != t2.right.val){
                return false;
            }
            if(t1.left != null){
                queue1.offer(t1.left);
            }
            if(t1.right != null){
                queue1.offer(t1.right);
            }
            if(t2.left != null){
                queue2.offer(t2.left);
            }
            if(t2.right != null){
                queue2.offer(t2.right);
            }
        }

        return true;
    }

    public static void main(String[] args) {
        SameTree st = new SameTree();
        TreeNode p = new TreeNode(1, new TreeNode(2, null, null), new TreeNode(3, null, null));
        TreeNode q = new TreeNode(1, new TreeNode(2, null, null), new TreeNode(3, null, null));
    }
}
