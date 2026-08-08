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
    public int rob(TreeNode root) {
        if(root == null) return 0;

        int robCurr = root.val;

        if(root.left != null){
            robCurr += rob(root.left.left) + rob(root.left.right) ;
        }
        if(root.right != null){
            robCurr += rob(root.right.left) + rob(root.right.right);
        }

        int skipNode = rob(root.left) + rob(root.right);

        return Math.max(robCurr, skipNode);
    }
}