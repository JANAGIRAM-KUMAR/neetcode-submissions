class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int[][] combined = new int[intervals.length+1][2];
        for(int i = 0; i < intervals.length; i++){
            combined[i] = intervals[i];
        }
        combined[intervals.length] = newInterval;
        return merge(combined);
    }
    public int[][] merge(int[][] intervals) {
        if(intervals.length <= 1) return intervals;
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        List<int[]> res = new ArrayList<>();

        int[] newInterval = intervals[0];
        res.add(newInterval);

        for(int[] interval : intervals){
            if(interval[0] <= newInterval[1]){
                newInterval[1] = Math.max(newInterval[1], interval[1]);
            } else {
                newInterval = interval;
                res.add(newInterval);
            }
        }
    return res.toArray(new int[res.size()][]);
    }
}
