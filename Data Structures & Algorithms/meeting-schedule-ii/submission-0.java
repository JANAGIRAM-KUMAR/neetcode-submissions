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
        int n = intervals.size();
        int[] startArr = new int[n];
        int[] endArr = new int[n];
        for(int i = 0; i < n; i++){
            startArr[i] = intervals.get(i).start;
            endArr[i] = intervals.get(i).end;
        }
        Arrays.sort(startArr);
        Arrays.sort(endArr);
        int s = 0, e = 0;
        int rooms = 0, maxRooms = 0;
        while(s < n){
            if(startArr[s] < endArr[e]){
                s++;
                rooms++;
            } else {
                e++;
                rooms--;
            }
            maxRooms = Math.max(maxRooms,rooms);
        }
        return maxRooms;
    }
}
