class Solution {
    public String findDifferentBinaryString(String[] nums) {
        int n = nums.length;
        double bc = Math.pow(2,n);
        Set<String> set = new HashSet<>();
        for(String s : nums){
            set.add(s);
        }
        String res = "";
        for(int i = 0; i < bc; i++){
            String curr = Integer.toBinaryString(i);
            if(!set.contains(curr)) res = curr;
        }
        return res;
    }
}
