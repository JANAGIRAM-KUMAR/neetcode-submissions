class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,Comparator.comparingInt(a -> a[1]));
        int res = intervals.length;
        int rightBoundary = Integer.MIN_VALUE;
        for(int[] interval : intervals){
            if (rightBoundary <= interval[0]){
                res -= 1;
                rightBoundary = interval[1];
            }
        }
        return res;
    }
}
