class Solution {
    public boolean primeSubOperation(int[] nums) {
        int n = nums.length;
        int prev = 0;
        for(int i = 0; i < n-1; i++){
            if(nums[i] < nums[i+1]) continue;
            else if (nums[i] >= nums[i+1]) {
                int curr = nums[i] - prev - 1;
                while(!isPrime(curr) && curr >= 2){
                    curr--;
                }
                 
                if(curr >= 2) nums[i] -= curr;
                if(nums[i] >= nums[i+1]) return false;

                //
            }
        }
        return true;
    }

    public boolean isPrime(int num){
        if(num < 2) return false;
        if(num == 2 || num == 3) return true;
        for(int i = 2; i * i <= num; i++){
            if(num % i == 0) return false;
        }
        return true;
    }
}
