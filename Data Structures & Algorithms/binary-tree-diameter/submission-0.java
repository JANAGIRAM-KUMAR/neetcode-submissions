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
    static int maxdia = 0;

    public int diaRecur(TreeNode root){
        if(root == null) return 0;
        
        int lh = diaRecur(root.left);
        int rh = diaRecur(root.right);

        if(lh + rh > maxdia)
            maxdia = lh + rh;

        return 1 + Math.max(lh,rh);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        maxdia = 0;
        diaRecur(root);
        return maxdia;
    }
}
