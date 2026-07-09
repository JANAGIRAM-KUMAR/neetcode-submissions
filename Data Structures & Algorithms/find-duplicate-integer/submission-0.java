class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> n = new HashSet<>();
        for(int num : nums){
            if(n.contains(num)) return num;
            n.add(num);
        }
        return -1;
    }
}
