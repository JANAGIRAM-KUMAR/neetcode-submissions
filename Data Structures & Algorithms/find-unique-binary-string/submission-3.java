class Solution {
    public String findDifferentBinaryString(String[] nums) {
        int n = nums.length;
        Set<String> set = new HashSet<>();
        for(String s : nums){
            set.add(s);
        }
        String res = "";
        for(int i = 0; i <= n; i++){
            String curr = Integer.toBinaryString(i);
            while(curr.length() < n) curr = "0" + curr;
            if(!set.contains(curr)) res = curr;
        }
        return res;
    }
}
