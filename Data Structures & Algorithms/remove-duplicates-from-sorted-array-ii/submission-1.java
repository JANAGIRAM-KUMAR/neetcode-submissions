class Solution {
    public int removeDuplicates(int[] nums) {
        Map<Integer, Integer> hm = new HashMap<>();
        for(int num : nums){
            hm.put(num, hm.getOrDefault(num,0)+1);
        }

        Arrays.fill(nums, 10001);
        int i = 0;
        int count = 0;
        for(Map.Entry<Integer, Integer> entry : hm.entrySet()){
            int key = entry.getKey();
            int val = entry.getValue();
            while(val > 2){
                hm.put(key, hm.get(key)-1);
                val--;
            }
            while(val > 0){
                nums[i++] = key;
                count++;
                val--;
            }
        }

        Arrays.sort(nums);
        return count;



        
    }
}


// 1 1 1 2 2 3
// l = 0


