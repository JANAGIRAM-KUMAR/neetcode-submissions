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

        int minDiff = Integer.MAX_VALUE;
        for(int j = 1; j < minutes.length; j++){
            minDiff = Math.min(minDiff, minutes[j] - minutes[j-1]);
        }

        int wrap = (24 * 60 - minutes[minutes.length - 1]) + minutes[0];

        minDiff = Math.min(minDiff, wrap);

        return minDiff;
    }
}
