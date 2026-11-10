class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int n=trips.length;
        int[] arr=new int[1001];
        for(int i=0;i<trips.length;i++){
            int people=trips[i][0];
            int from=trips[i][1];
            int to=trips[i][2];
            arr[from]+=people;
            arr[to]-=people;
        }
        int  count=0;
        for(int i=0;i<arr.length;i++){
            count+=arr[i];
            if(count>capacity) return false;
        }
        return true;
    }
}