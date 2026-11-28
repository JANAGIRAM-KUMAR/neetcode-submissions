class Solution {
    public int[] sortJumbled(int[] mapping, int[] nums) {
        int n = nums.length;
        int[] mapped = new int[n];
        for(int i = 0; i < n; i++){
            int curr = nums[i];
            int res = 0;
            int count = 0;
            if(curr == 0){
                mapped[i] = mapping[0];
                continue;
            }
            while(curr > 0){
                int digit = curr % 10;
                digit = mapping[digit];
                res = (res * 10) + digit;
                curr /= 10;
                count++;
            }
            int newRes = 0;
            while(count > 0){
                int digit = res % 10;
                newRes = (newRes * 10) + digit;
                res /= 10;
                count--;
            }
            mapped[i] = newRes;
        }
        Map<Integer, Deque<Integer>> hm = new HashMap<>();
        for(int i = 0; i < n; i++){
            hm.putIfAbsent(mapped[i], new ArrayDeque<>());
            hm.get(mapped[i]).offer(nums[i]);
        }
        Arrays.sort(mapped);
        int[] res = new int[n];
        for(int i = 0; i < n; i++){
            res[i] = hm.get(mapped[i]).poll();
        }
        return res;
    }
}