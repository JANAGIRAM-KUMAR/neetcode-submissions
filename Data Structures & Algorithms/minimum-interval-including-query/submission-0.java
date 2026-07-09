class Solution {
    public int[] minInterval(int[][] intervals, int[] queries) {
        int n = intervals.length;
        int q = queries.length;

        Arrays.sort(intervals,(a,b) -> a[0] - b[0]);
        int[][] queriesWithIndex = new int[q][2];
        for(int i = 0; i < q; i++){
            queriesWithIndex[i] = new int[] {queries[i],i};
        }
        Arrays.sort(queriesWithIndex,(a,b) -> a[0] - b[0]);
        int[] res = new int[q];
        Arrays.fill(res,-1);
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a,b) -> a[0] - b[0]);
        int intervalIndex = 0;
        for(int[] query : queriesWithIndex){
            int queryValue = query[0];
            int currIndex = query[1];
            while(intervalIndex < n && intervals[intervalIndex][0] <= queryValue){
                int startTime = intervals[intervalIndex][0];
                int endTime = intervals[intervalIndex][1];
                int intervalLength = endTime - startTime + 1;

                minHeap.offer(new int[] {intervalLength, endTime});
                intervalIndex++;
            }

            while(!minHeap.isEmpty() && minHeap.peek()[1] < queryValue){
                minHeap.poll();
            }
            if(!minHeap.isEmpty()){
                res[currIndex] = minHeap.peek()[0];
            }
        }
        return res;
    }
}
