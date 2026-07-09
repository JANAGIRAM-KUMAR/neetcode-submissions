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

public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        if(root == null) return "N";
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            TreeNode node = q.poll();
            if(node == null){
                sb.append("N,");
                continue;
            }
            sb.append(node.val).append(",");
            q.add(node.left);
            q.add(node.right);
        }
        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] nodes = data.split(",");
        if(nodes[0].equals("N")) return null;
        TreeNode root = new TreeNode(Integer.parseInt(nodes[0]));
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int i = 1;
        while(!q.isEmpty()){
            TreeNode curr = q.poll();
            if(!nodes[i].equals("N")){
                TreeNode left = new TreeNode(Integer.parseInt(nodes[i]));
                curr.left = left;
                q.add(left);
            } i++;
            if(!nodes[i].equals("N")){
                TreeNode right = new TreeNode(Integer.parseInt(nodes[i]));
                curr.right = right;
                q.add(right);
            } i++;
        }
        return root;
    }
}
