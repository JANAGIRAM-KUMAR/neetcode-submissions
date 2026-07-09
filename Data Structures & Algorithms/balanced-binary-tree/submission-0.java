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
    public int isBalancedRec(TreeNode root){
        if(root == null) return 0;

        int lh = isBalancedRec(root.left);
        int rh = isBalancedRec(root.right);

        if(lh == -1 || rh == -1 || Math.abs(lh - rh) > 1) return -1;
        return Math.max(lh, rh) + 1;
    }
    public boolean isBalanced(TreeNode root) {
        return isBalancedRec(root) >= 0;
    }
}
