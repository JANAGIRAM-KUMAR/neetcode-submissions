class Solution {
    public int findLucky(int[] arr) {
        int lucky = -1;
        Map<Integer, Integer> hm = new HashMap<>();
        for(int n : arr){
            hm.put(n, hm.getOrDefault(n,0) + 1);           
        }

        for(Map.Entry<Integer, Integer> entry : hm.entrySet()){
            int key = entry.getKey();
            int val = entry.getValue();
            if(key == val)
                lucky = Math.max(lucky, key);
        }

        return lucky;
    }
}