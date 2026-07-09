class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> hm = new HashMap<>();
        int n = numbers.length;
        for(int i = 0; i < n; i++){
            int diff = target - numbers[i];
            if(hm.containsKey(diff)){
                return new int[]{hm.get(diff)+1,i+1};
            }
            hm.put(numbers[i],i);
        }
        return new int[]{};
    }
}
