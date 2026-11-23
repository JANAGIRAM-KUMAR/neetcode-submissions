class Solution {
    public boolean primeSubOperation(int[] nums) {
        int n = nums.length;
        for(int i = 0; i < n-1; i++){
            if(nums[i] < nums[i+1]) continue;
            else if (nums[i] >= nums[i+1]) {
                int next = nums[i+1] - 1;
                while(!isPrime(next) && next >= 2){
                    next--;
                }
                 
                if(next >= 2)nums[i] -= next;
                if(nums[i] >= nums[i+1]) return false;
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
