class Solution {
    public int maxDifference(String s) {
        int maxDiff = 0;

        HashMap<Character, Integer> hm = new HashMap<>();
        for(char c : s.toCharArray()){
            hm.put(c,hm.getOrDefault(c,0)+1);
        }

        int minFreq = Integer.MAX_VALUE;
        int maxFreq = Integer.MIN_VALUE;
        for(Map.Entry<Character, Integer> entry : hm.entrySet()){
            int val = entry.getValue();
            if(val % 2 == 0)
                minFreq = Math.min(minFreq, val);
            else 
                maxFreq = Math.max(maxFreq, val);
        }

        if(minFreq != Integer.MAX_VALUE && maxFreq != Integer.MIN_VALUE){
            maxDiff = maxFreq - minFreq;
        }

        return maxDiff;
    }
}