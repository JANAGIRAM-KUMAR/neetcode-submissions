class KthLargest {

    List<Integer> minHeap;
    int k;


    public KthLargest(int k, int[] nums) {
        this.k = k;
        minHeap = new ArrayList<>();
        for(int n: nums){
            minHeap.add(n);
        }
    }
    
    public int add(int val) {
        minHeap.add(val);
        int size = minHeap.size();
        Collections.sort(minHeap);
        return minHeap.get(size - k);
    }
}
