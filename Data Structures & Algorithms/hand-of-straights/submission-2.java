class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if(groupSize > hand.length) return false;
        HashMap<Integer,Integer> hm = new HashMap<>();
        Arrays.sort(hand);
        for(int h: hand){
            hm.put(h,hm.getOrDefault(h,0)+1);
        }
        for(int num : hand){
            if(hm.get(num) == 0) continue;
            if(hm.get(num) > 0){
                for(int i = 0; i < groupSize; i++){
                    int curr = num + i;
                    if(!hm.containsKey(curr)) return false;
                    //if(hm.get(curr) == 0) return false;
                    hm.put(curr,hm.get(curr) - 1);
                }
            }
        }
        return true;
    }
}

