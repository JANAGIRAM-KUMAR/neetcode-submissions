class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int n = nums.length;
        int maj = n/3;
        for(int num : nums){
            hm.put(num, hm.getOrDefault(num,0)+1);
        }

        List<Integer> res = new ArrayList<>();
        for(Map.Entry<Integer,Integer> mp : hm.entrySet()){
            int key = mp.getKey();
            int val = mp.getValue();
            if(val > maj){
                res.add(key);
            }
        }

        return res;


    }
}