class Solution {
    public int findMinDifference(String[] timePoints) {
        int[] minutes = new int[timePoints.length];
        int i = 0;
        for(String t : timePoints){
            String[] time = t.split(":");
            int hrs = Integer.parseInt(time[0]);
            int min = Integer.parseInt(time[1]);
            minutes[i++] = (hrs * 60) + min;
        }
        Arrays.sort(minutes);

        if(minutes[0] < 60) minutes[0] += 1440;

        return Math.abs(minutes[1] - minutes[0]);
    }
}
