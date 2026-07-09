class Solution {
    public int squared(int[] points){
        return points[0]*points[0] + points[1]*points[1];
    }
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a,b) -> b[0] - a[0]);
        for(int i = 0; i < points.length; i++){
            int dist = squared(points[i]);
            int[] entry = new int[]{dist, i};
            if(maxHeap.size() < k) maxHeap.offer(entry);
            else {
                if(dist < maxHeap.peek()[0]){
                    maxHeap.poll();
                    maxHeap.offer(entry);
                }
            }
        }

        int[][] res = new int[k][2];
        int i = 0;
        while(!maxHeap.isEmpty()){
            int index = maxHeap.poll()[1];
            // int[] temp = new int[2];
            // temp[0] = points[index][0];
            // temp[1] = points[index][1];
            res[i][0] = points[index][0];
            res[i][1] = points[index][1];
            i++;
        }
        return res;
    }
}
