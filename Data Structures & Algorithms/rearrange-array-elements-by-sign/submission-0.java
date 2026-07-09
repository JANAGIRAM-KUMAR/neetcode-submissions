class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] po = new int[n/2];
        int[] ne = new int[n/2];
        int i = 0, j = 0;
        for(int num : nums){
            if(num < 0){
                ne[j++] = num;
            } else {
            po[i++] = num;
            }
        }

        i = 0;
        j = 0;

        int[] res = new int[n];
        for(int a = 0; a < n; a += 2){
            res[a] = po[i++];
            res[a+1] = ne[j++];
        }
        return res;
    }
}