class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        Arrays.sort(nums);
        for(int n : nums){
            minHeap.offer(n);
            if(minHeap.size() > k) minHeap.poll();
        }
        return minHeap.peek();
    }
}