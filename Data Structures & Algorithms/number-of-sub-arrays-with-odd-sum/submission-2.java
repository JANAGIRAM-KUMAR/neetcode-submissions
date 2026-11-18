class Solution {
    public int numOfSubarrays(int[] arr) {
        int n = arr.length;
        int[] prefix = new int[n];
        prefix[0] = arr[0];
        int MOD = 1000000007;
        for(int i = 1; i < n; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }

        int even = 1;
        int odd = 0;
        int count = 0;
        for(int i = 0; i < n; i++){
            if(prefix[i] % 2 != 0){
                count += even;
                odd++;
            } else {
                count += odd;
                even++;
            }
        }

        return count % MOD;
    }
} 


//1 4 9


