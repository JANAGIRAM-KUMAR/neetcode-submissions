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

        int minDiff = 1440 + minutes[0] - minutes[minutes.length - 1];
        for(int j = 1; j < minutes.length; j++){
            minDiff = Math.min(minDiff, minutes[j] - minutes[j-1]);
        }


        return minDiff;
    }
}
