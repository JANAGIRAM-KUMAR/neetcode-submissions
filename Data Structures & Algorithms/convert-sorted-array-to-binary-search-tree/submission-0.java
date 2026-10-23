class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return buildBST(nums,0,nums.length-1);
    }

    public TreeNode buildBST(int[] nums, int l, int r){
        if(l>r) return null;
        int m = l + (r-l) / 2;
        TreeNode root = new TreeNode(nums[m]);
        root.left = buildBST(nums,l,m-1);
        root.right = buildBST(nums,m+1,r);
        return root;
    }
}
