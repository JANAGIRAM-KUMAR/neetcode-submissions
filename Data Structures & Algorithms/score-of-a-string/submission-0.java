class Solution {
    public int scoreOfString(String s) {
        int n = s.length();
        int[] nums = new int[n];
        int i = 0;
        for(char c : s.toCharArray()){
            nums[i] = c;
            i++;
        } 
        int res = absoluteSum(nums, 0);
        return res;
    }

    public int absoluteSum(int[] arr, int sum){
        for(int i = 0; i < arr.length - 1; i++){
            sum += Math.abs(arr[i] - arr[i+1]);
        }
        return sum;
    }
}