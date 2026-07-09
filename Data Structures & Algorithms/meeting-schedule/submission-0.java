/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
        Interval[] arr = intervals.toArray(new Interval[0]);
        int n = arr.length;
        Arrays.sort(arr, Comparator.comparingInt(a -> a.start));
        for(int i = 1; i < n; i++){
            if(arr[i-1].end > arr[i].start) return false;
        }
        return true;
    }
}
