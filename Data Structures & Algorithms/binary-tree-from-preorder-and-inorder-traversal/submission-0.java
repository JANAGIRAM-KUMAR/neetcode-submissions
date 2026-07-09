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
    public TreeNode splitTree(int[] preorder, Map<Integer, Integer> indexOfInorder, int rootIndex, int left, int right){
        TreeNode root = new TreeNode(preorder[rootIndex]);
        int mid = indexOfInorder.get(root.val);
        if(mid > left){
            root.left = splitTree(preorder, indexOfInorder, rootIndex+1, left, mid-1);
        }
        if(mid < right){
            root.right = splitTree(preorder, indexOfInorder, rootIndex + mid - left + 1, mid+1, right);
        }
        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer, Integer> ioi = new HashMap<>();
        for(int i = 0; i < inorder.length; i++){
            ioi.put(inorder[i],i);
        }
        return splitTree(preorder,ioi,0,0,inorder.length - 1);
    }
}
