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
    public int minMeetingRooms(List<Interval> intervals) {
        Interval[] arr = intervals.toArray(new Interval[0]);
        int maxEnd = 0;
        for(Interval a : intervals){
            maxEnd = Math.max(maxEnd, a.end);
        }
        int[] diffArr = new int[maxEnd + 1];
        for(Interval a : intervals){
            diffArr[a.start]++;
            diffArr[a.end]--;
        }
        int maxRooms = 0;
        int currRooms = 0;
        for(int i : diffArr){
            currRooms += i;
            maxRooms = Math.max(maxRooms,currRooms);
        }
        return maxRooms;
    }
}
