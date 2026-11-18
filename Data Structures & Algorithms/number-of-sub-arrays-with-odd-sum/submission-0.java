class Solution {
    public int numOfSubarrays(int[] arr) {
        int n = arr.length;
        int count = 0;
        int MOD = (int) 1e9+7;
        for(int i = 0; i < n; i++){
            int sum = 0;
            for(int j = i; j < n; j++){
                sum += arr[j];
                if(sum % 2 != 0) count = (count+1)%MOD;
            }
        }

        return count;
    }
}




