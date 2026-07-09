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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true;
        if(p == null || q == null) return false;

        Queue<TreeNode> q1 = new LinkedList<>();
        Queue<TreeNode> q2 = new LinkedList<>();
        q1.add(p);
        q2.add(q);

        while(!q1.isEmpty() && !q2.isEmpty()){
            TreeNode p1 = q1.poll();
            TreeNode p2 = q2.poll();

            if(p1.val != p2.val) return false;

            if(p1.left != null && p2.left != null){
                q1.add(p1.left); q2.add(p2.left);
            } else if(p1.left != null || p2.left != null) {
                return false;
            }

            if(p1.right != null && p2.right != null){
                q1.add(p1.right); q2.add(p2.right);
            } else if(p1.right != null || p2.right != null){
                return false;
            }
        }

        return q1.isEmpty() && q2.isEmpty();

    }
}
