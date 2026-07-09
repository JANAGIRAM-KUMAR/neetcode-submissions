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
    int count = 0;
    public void find(TreeNode node, int max){
        if(node == null) return;
        if(node.val >= max) count++;

        find(node.left, Math.max(node.val,max));
        find(node.right, Math.max(node.val,max));
    }
    public int goodNodes(TreeNode root) {
        find(root, Integer.MIN_VALUE);
        return count;
    }
}
