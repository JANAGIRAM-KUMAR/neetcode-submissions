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
    public int rangeSumBST(TreeNode root, int low, int high) {
        int res = 0;
        Deque<TreeNode> st = new ArrayDeque<>();
        st.push(root);
        while(!st.isEmpty()){
            TreeNode curr = st.pop();
            if(curr.val >= low && curr.val <= high) res += curr.val;
            if(curr.left != null && curr.val > low) st.push(curr.left);
            if(curr.right != null && curr.val < high) st.push(curr.right);
            
        }

        return res;
    }
}