class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer, Integer> hm = new HashMap<>();
        for(int n : nums1) hm.put(n, hm.getOrDefault(n,0)+1);

        Set<Integer> arr = new HashSet<>();

        for(int i = 0; i < nums2.length; i++){
            int curr = nums2[i];
            if(hm.getOrDefault(curr,0) > 0){
                arr.add(nums2[i]);
                hm.put(nums2[i], hm.get(nums2[i])-1);
            }
        }

        int[] res = new int[arr.size()];
        int i = 0;
        for(int n : arr) res[i++] = n;

        return res;
    }
}