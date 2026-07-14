class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int n = people.length;
        int max = Arrays.stream(people).max().getAsInt();
        int[] count = new int[max+1];
        for(int p : people){
            count[p]++;
        }
        int idx = 0, i = 1;
        while (idx < people.length) {
            while (count[i] == 0) {
                i++;
            }
            people[idx++] = i;
            count[i]--;
        }

        int minBoats = 0;
        int l = 0, r = n-1;
        while(l <= r){
            if(people[l] + people[r] <= limit){
                l++;
            } 
            minBoats++;
            r--;
        }
        return minBoats;
    }
}