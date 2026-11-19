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
    public TreeNode reverseOddLevels(TreeNode root) {
        List<TreeNode> nodes = new ArrayList<>();
        nodes.add(root);
        int level = 0;
        while(!nodes.isEmpty()){
            if(level % 2 == 1){
                for(int i = 0, j = nodes.size()-1; i < j; i++, j--){
                    int value = nodes.get(i).val;
                    nodes.get(i).val = nodes.get(j).val;
                    nodes.get(j).val = value;
                }
            }

            List<TreeNode> next = new ArrayList<>();
            for(TreeNode node : nodes){
                if(node.left != null)
                    next.add(node.left);
                if(node.right != null)
                    next.add(node.right);
            }
            nodes = next;
            level++;
        }
        return root;
    }
}

