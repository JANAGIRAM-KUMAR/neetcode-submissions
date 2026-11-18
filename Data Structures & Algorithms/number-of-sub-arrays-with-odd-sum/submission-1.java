class Solution {
    public int numOfSubarrays(int[] arr) {
        int n = arr.length;
        int[] prefix = new int[n];
        prefix[0] = arr[0];
        int MOD = 1000000007;
        for(int i = 1; i < n; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }

        int count = 0;
        for(int i = 0; i < n; i++){
            if(prefix[i] % 2 != 0) count++;
            for(int j = 0; j < i; j++){
                int sum = prefix[j] - prefix[i];
                if(sum % 2 != 0) count++;
            }
        }

        return count % MOD;
    }
} 


//1 4 9


