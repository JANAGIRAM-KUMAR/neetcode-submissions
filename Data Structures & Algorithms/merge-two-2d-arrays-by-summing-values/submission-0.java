class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int[] count = new int[1001];
        for(int[] num : nums1){
            count[num[0]] += num[1];
        }
        for(int[] num : nums2){
            count[num[0]] += num[1];
        }
        List<int[]> res = new ArrayList<>();
        for(int i = 1; i <= 1000; i++){
            if(count[i] > 0) res.add(new int[] {i, count[i]});
        }
        return res.toArray(new int[0][]);
    }
}
