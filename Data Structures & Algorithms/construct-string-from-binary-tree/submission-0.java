class Solution {
    public String tree2str(TreeNode root) {
        if (root == null) return "";
        Deque<TreeNode> st = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        TreeNode close = new TreeNode();
        TreeNode open = new TreeNode();
        st.push(root);
        while (!st.isEmpty()) {
            TreeNode curr = st.pop();
            if (curr == open) {
                sb.append('(');
                continue;
            }
            if (curr == close) {
                sb.append(')');
                continue;
            }
            sb.append(curr.val);
            if (curr.right != null) {
                st.push(close);
                st.push(curr.right);
                st.push(open);
            }
            if (curr.left != null) {
                st.push(close);
                st.push(curr.left);
                st.push(open);
            } else if (curr.right != null) {
                sb.append("()");
            }
        }
        return sb.toString();
    }
}
