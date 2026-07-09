public class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums == null || k <=0) return new int[0];
        int[] res = new int[nums.length - k + 1];
        int index = 0;
        Deque<Integer> q = new ArrayDeque<>();
        for(int i = 0; i < nums.length; i++){
            if(!q.isEmpty() && q.peekFirst() == i - k) q.pollFirst();
            while(!q.isEmpty() && nums[q.peekLast()] < nums[i]) q.pollLast();
            q.addLast(i);
            if(i >= k - 1) res[index++] = nums[q.peekFirst()];
        }
        return res;
    }
}