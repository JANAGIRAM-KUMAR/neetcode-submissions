class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {


        int sn = spells.length;
        int pn = potions.length;

        Arrays.sort(potions);

        int[] res = new int[sn];

        for(int i = 0; i < sn; i++){
            int spell = spells[i];
            int l = 0, r = pn;
            while(l < r){
                int m = l + (r-l)/2;
                if((long) potions[m] * spell >= success){
                    r = m;
                } else {
                    l = m+1;
                }
                res[i] = pn - l;
            }
        }

        return res;

    }   
}
