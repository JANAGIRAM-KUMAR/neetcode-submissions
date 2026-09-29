class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int n = customers.length;
        int sum = 0;
        for(int i = 0; i < n; i++){
            if(grumpy[i] == 0) sum += customers[i];
        }

        int l = 0;
        int max = 0;
        for(int r = 0; r < n; r++){
            if(grumpy[r] == 1) sum += customers[r];
            if(r-l+1 == minutes){
                max = Math.max(max,sum);
                if(grumpy[l] == 1){
                    sum -= customers[l];
                    l++;
                } 
                if(grumpy[l] == 0 && l < n) l++;
            }
            max = Math.max(max,sum);
        }
        return max;
    }
}