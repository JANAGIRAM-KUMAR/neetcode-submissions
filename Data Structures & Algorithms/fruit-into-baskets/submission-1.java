class Solution {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;
        Map<Integer, Integer> hm = new HashMap<>();
        int l = 0;
        int res = 0;
        for(int r = 0; r < n; r++){
            int curr = fruits[r];
            hm.put(curr, hm.getOrDefault(curr,0) + 1);

            if(hm.size() > 2){
                int left = fruits[l];
                hm.put(left, hm.get(left) - 1);
                if(hm.get(left) == 0){
                    hm.remove(left);
                }
                l++;
            }
            
            res = Math.max(res, r-l+1);
        }
        return res;
    }
}