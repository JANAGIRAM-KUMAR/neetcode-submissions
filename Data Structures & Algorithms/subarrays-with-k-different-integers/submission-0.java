class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        int l = 0;
        for(int r = 0; r < n; r++){
            int curr = nums[r];
            map.put(curr, map.getOrDefault(curr,0)+1);
            while(map.size() > k){
                int left = nums[l];
                map.put(left, map.get(left) - 1);
                if(map.get(left) == 0) map.remove(left);
                l++;
            }
            count += r-l+1;    
        }
        int res = count;
        count = 0;
        l = 0;
        k -= 1;
        map.clear();
        for(int r = 0; r < n; r++){
            int curr = nums[r];
            map.put(curr, map.getOrDefault(curr,0)+1);
            while(map.size() > k){
                int left = nums[l];
                map.put(left, map.get(left) - 1);
                if(map.get(left) == 0) map.remove(left);
                l++;
            }
            count += r-l+1;    
        }

        return res - count;

    }
}